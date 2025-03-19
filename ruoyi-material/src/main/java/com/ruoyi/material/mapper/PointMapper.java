package com.ruoyi.material.mapper;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.material.domain.Ten_Mentals_Value;
import com.ruoyi.material.domain.ten_max_min;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper

public interface PointMapper {

    //判断表是否存在（有些组合可能出现表不存在的情况）
    public String if_table_exist(@Param("tablename") String tablename);

    //查询一张表中所有行 的 十个金属属性，找到于用户输入最接近的
    public List<Ten_Mentals_Value> select_all(@Param("table_name1") String table_name1);
    //查询维氏硬度hv
    public String select_hv(@Param("table_name2") String table_name2,@Param("X") String X,@Param("Y") String Y);
   //查找坐标x_y
    public String select_xy(@Param("table_name1") String table_name1,@Param("Al") double Al,@Param("Ti") double Ti,@Param("Cr") double Cr,@Param("Co") double Co,@Param("Ni") double Ni,@Param("Nb") double Nb,@Param("Mo") double Mo,@Param("Hf") double Hf,@Param("Ta") double Ta,@Param("W") double W);

    //查询均值、方差、最大值、最小值等
    public Ten_Mentals_Value select_attribute(@Param("tablename") String tablename, @Param("attribute") String attribute);

    //查询十个金属范围
    public ten_max_min select_limit(@Param("tablename")  String tablename);
}
