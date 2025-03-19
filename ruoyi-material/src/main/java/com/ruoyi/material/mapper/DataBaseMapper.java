package com.ruoyi.material.mapper;

import com.ruoyi.material.domain.DataBase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DataBaseMapper {
    //查询数据库网站信息
    public List<DataBase> select_database();

    //更新数据库网站信息
    public void update_database(@Param("name") String name, @Param("url")String url);

}
