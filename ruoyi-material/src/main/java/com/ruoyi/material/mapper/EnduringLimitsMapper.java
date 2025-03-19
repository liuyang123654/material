package com.ruoyi.material.mapper;

import java.util.List;

import com.ruoyi.material.domain.DurablePerformance;
import com.ruoyi.material.domain.EnduringLimits;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@Mapper
public interface EnduringLimitsMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEnduringLimitsByTrademark(String trademark);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEnduringLimitsByTrademarks(String[] trademarks);

    /**
     * @Author 刘洋
     * @Date 2023/5/13
     */
    //牌号
    public List<String> select_trademark();
    //热处理制度
    public List<String> select_heatTreatmentSystem();
    //大查询 持久极限
    public List<EnduringLimits> select_enduring_limits(@Param("trademark") String trademark, @Param("heat_treatment_system") String heat_treatment_system, @Param("temperature_min")Long temperature_min, @Param("temperature_max")Long temperature_max,@Param("time_min") Long time_min, @Param("time_max") Long time_max);


    //查询最大最小温度
    public Long select_temperature_max();
    public Long select_temperature_min();

    //查询最大最小时间
    public Long select_time_max();
    public Long select_time_min();
}
