package com.ruoyi.material.service.impl;

import com.ruoyi.material.domain.DataBase;
import com.ruoyi.material.mapper.DataBaseMapper;
import com.ruoyi.material.service.IDataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Service
public class DataBaseServiceImpl implements IDataBaseService {
    @Autowired
    private DataBaseMapper dataBaseMapper;
    @Autowired
    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Override
    //查询金属数据库网站信息
    public Map<String, String> select_database() {
        Map<String, String> map = new HashMap<>();
        Set<Object> keys = redisTemplate.opsForHash().keys("friend_database");
        if (!keys.isEmpty()) {
            System.out.println("从redis读取");
            for (Object key : keys) {
                map.put(key.toString(), redisTemplate.opsForHash().get("friend_database", key.toString()).toString());
            }
            return map;
        } else {
            System.out.println("从数据库读取并且写入redis");
            List<DataBase> list = dataBaseMapper.select_database();
            System.out.println("写入友情数据库链接到redis啦！！！！！！！");
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                map.put(list.get(i).getName(), list.get(i).getUrl());
                //插入到redis中

                redisTemplate.opsForHash().put("friend_database", list.get(i).getName(), list.get(i).getUrl());

            }
            redisTemplate.expire("friend_database", 120, TimeUnit.SECONDS);
            return map;
        }

/*
    //查
        return redisTemplate.execute((RedisCallback<Map<String, String>>) con -> {
            Map<byte[], byte[]> result = con.hGetAll("friend_database".getBytes());
            if (CollectionUtils.isEmpty(result)) {
                Map<String, String> ans = new HashMap<>();
                //return new HashMap<>(0);
                List<DataBase> list=dataBaseMapper.select_database();
                System.out.println("写入友情数据库链接到redis啦！！！！！！！");
                System.out.println(list.size());
                for(int i=0;i<list.size();i++){
                    ans.put(list.get(i).getName(),list.get(i).getUrl());
                    //插入到redis中

                    redisTemplate.opsForHash().put("friend_database", list.get(i).getName(), list.get(i).getUrl());
                    redisTemplate.expire("friend_database",120, TimeUnit.SECONDS);
                }

                return ans;
            }
            System.out.println("从redis中读取");
            Map<String, String> ans = new HashMap<>(result.size());
            for (Map.Entry<byte[], byte[]> entry : result.entrySet()) {
                ans.put(new String(entry.getKey()), new String(entry.getValue()));
            }
            return ans;
        });*/
    }

    //更新金属数据库网站信息
    @Override
    public void update_database(String name, String url) throws InterruptedException {//throws InterruptedException {


        //延时双删策略
        //第一次删除
        if(redisTemplate.hasKey("friend_database"))//判断是否存在
        {
            System.out.println("更新时存在，删掉");
            redisTemplate.delete("friend_database");//删除redis相关信息
        }


        //数据库执行
        dataBaseMapper.update_database(name, url);

        Thread.sleep(150);//选100的原因是这个平时执行60ms左右

        //第二次删除
        if(redisTemplate.hasKey("friend_database"))//判断是否存在
        {
            System.out.println("更新时存在，删掉");
            redisTemplate.delete("friend_database");//删除redis相关信息
        }


    }
}

