package com.ruoyi.material.service.impl;

import com.ruoyi.material.domain.Ten_Mentals_Value;
import com.ruoyi.material.domain.ten_max_min;
import com.ruoyi.material.mapper.PointMapper;
import com.ruoyi.material.service.IPointService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointServiceImpl implements IPointService {
    @Autowired
    private PointMapper pointMapper;

    //查询一张表中所有行 的 十个金属属性，找到于用户输入最接近的
    @Override
    public List<Ten_Mentals_Value> select_all(String table_name1){
        return pointMapper.select_all(table_name1);
    }
    //查询HV
    @Override
    public String select_hv(String table_name2, String X,String Y) {
        return pointMapper.select_hv(table_name2,X,Y);
    }
    //查询x_y
    @Override
    public String select_xy(String table_name1, double Al,double Ti,double Cr, double Co, double Ni,  double Nb,double Mo,double Hf, double Ta,  double W) {
        return pointMapper.select_xy(table_name1,Al,Ti,Cr, Co, Ni,Nb,Mo,Hf, Ta, W);
    }
    @Override
    //查询均值、方差、最大值、最小值等
    public Ten_Mentals_Value select_attribute(String tablename, String attribute)
    {
        return pointMapper.select_attribute(tablename,attribute);
    }
    @Override
    //查询十个金属范围
    public ten_max_min select_limit(String tablename)
    {
        return pointMapper.select_limit(tablename);
    }
    @Override
    //判断表是否存在（有些组合可能出现表不存在的情况）
    public String if_table_exist(String tablename)
    {
        return pointMapper.if_table_exist(tablename);
    }
}
