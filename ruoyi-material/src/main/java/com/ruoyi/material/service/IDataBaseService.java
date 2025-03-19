package com.ruoyi.material.service;

import com.ruoyi.material.domain.DataBase;

import java.util.List;
import java.util.Map;

public interface IDataBaseService {
    //查询数据库网站信息
    public Map<String, String> select_database();

    //更新数据库网站信息
    public void update_database(String name,String url) throws InterruptedException;

}
