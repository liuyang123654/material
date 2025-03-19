package com.ruoyi.material.service;

import java.util.List;
import com.ruoyi.material.domain.Creep;
import com.ruoyi.material.domain.DurablePerformance;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
public interface ICreepService 
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
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteCreepByTrademarks(String[] trademarks);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteCreepByTrademark(String trademark);

    /**
     * @Author 刘洋
     * @Date 2023/5/20
     */
    //牌号
    public List<String> select_trademark();
    //热处理制度
    public List<String> select_heatTreatmentSystem();
    //大查询 持久性能
    public List<Creep> select_creep(String trademark, String heat_treatment_system, Long temperature_min, Long temperature_max,Long time_min, Long time_max, Long stress_min, Long stress_max);

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
