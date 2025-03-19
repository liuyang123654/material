package com.ruoyi.material.service;

import java.util.List;

import com.ruoyi.material.domain.DurablePerformance;
import com.ruoyi.material.domain.EnduringLimits;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
public interface IEnduringLimitsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public EnduringLimits selectEnduringLimitsByTrademark(String trademark);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param enduringLimits 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<EnduringLimits> selectEnduringLimitsList(EnduringLimits enduringLimits);

    /**
     * 新增【请填写功能名称】
     * 
     * @param enduringLimits 【请填写功能名称】
     * @return 结果
     */
    public int insertEnduringLimits(EnduringLimits enduringLimits);

    /**
     * 修改【请填写功能名称】
     * 
     * @param enduringLimits 【请填写功能名称】
     * @return 结果
     */
    public int updateEnduringLimits(EnduringLimits enduringLimits);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteEnduringLimitsByTrademarks(String[] trademarks);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEnduringLimitsByTrademark(String trademark);

    /**
     * @Author 刘洋
     * @Date 2023/5/13
     */
    //牌号
    public List<String> select_trademark();
    //热处理制度
    public List<String> select_heatTreatmentSystem();
    //大查询 持久性能
    public List<EnduringLimits> select_enduring_limits(String trademark, String heat_treatment_system,Long temperature_min,Long temperature_max, Long time_min, Long time_max);


    //查询最大最小温度
    public Long select_temperature_max();
    public Long select_temperature_min();

    //查询最大最小时间
    public Long select_time_max();
    public Long select_time_min();
}
