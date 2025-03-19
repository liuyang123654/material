package com.ruoyi.material.mapper;

import java.util.List;
import com.ruoyi.material.domain.Creep;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@Mapper
public interface CreepMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Creep selectCreepByTrademark(String trademark);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param creep 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Creep> selectCreepList(Creep creep);

    /**
     * 新增【请填写功能名称】
     * 
     * @param creep 【请填写功能名称】
     * @return 结果
     */
    public int insertCreep(Creep creep);

    /**
     * 修改【请填写功能名称】
     * 
     * @param creep 【请填写功能名称】
     * @return 结果
     */
    public int updateCreep(Creep creep);

    /**
     * 删除【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteCreepByTrademark(String trademark);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCreepByTrademarks(String[] trademarks);



    /**
     * @Author 刘洋
     * @Date 2023/5/20
     */
    //牌号
    public List<String> select_trademark();
    //热处理制度
    public List<String> select_heatTreatmentSystem();
    //大查询 蠕变
    public List<Creep> select_creep(@Param("trademark") String trademark, @Param("heat_treatment_system") String heat_treatment_system, @Param("temperature_min") Long temperature_min, @Param("temperature_max") Long temperature_max, @Param("time_min") Long time_min,@Param("time_max") Long time_max,@Param("stress_min")Long stress_min, @Param("stress_max")Long stress_max);

    //查询最大最小温度
    public Long select_temperature_max();
    public Long select_temperature_min();

    //查询最大最小时间
    public Long select_time_max();
    public Long select_time_min();
    //查询最大最小应力
    public Long select_stress_max();
    public Long select_stress_min();
}
