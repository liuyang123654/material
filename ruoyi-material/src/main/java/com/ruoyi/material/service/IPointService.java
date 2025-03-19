package com.ruoyi.material.service;

import com.ruoyi.material.domain.Ten_Mentals_Value;
import com.ruoyi.material.domain.ten_max_min;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IPointService {
    //判断表是否存在（有些组合可能出现表不存在的情况）
    public String if_table_exist(String tablename);

    //查询一张表中所有行 的 十个金属属性，找到于用户输入最接近的
    public List<Ten_Mentals_Value> select_all(String table_name1);
    //查坐标x_y
    public String select_xy(String table_name1, double Al,double Ti,double Cr, double Co, double Ni,  double Nb,double Mo,double Hf, double Ta,  double W);

    //查hv(维氏硬度)
    public String select_hv(String table_name2,String X,String Y);
    //查询均值、方差、最大值、最小值等
    public Ten_Mentals_Value select_attribute(String tablename, String attribute);

    //查询十个金属范围
    public ten_max_min select_limit(String tablename);

}
