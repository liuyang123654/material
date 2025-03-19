package com.ruoyi.material.mapper;

import java.util.List;
import com.ruoyi.material.domain.DurablePerformance;
import com.ruoyi.material.domain.TensileProperties;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@Mapper
public interface DurablePerformanceMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public DurablePerformance selectDurablePerformanceByTrademark(String trademark);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param durablePerformance 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DurablePerformance> selectDurablePerformanceList(DurablePerformance durablePerformance);

    /**
     * 新增【请填写功能名称】
     * 
     * @param durablePerformance 【请填写功能名称】
     * @return 结果
     */
    public int insertDurablePerformance(DurablePerformance durablePerformance);

    /**
     * 修改【请填写功能名称】
     * 
     * @param durablePerformance 【请填写功能名称】
     * @return 结果
     */
    public int updateDurablePerformance(DurablePerformance durablePerformance);

    /**
     * 删除【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDurablePerformanceByTrademark(String trademark);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDurablePerformanceByTrademarks(String[] trademarks);

    /**
     * @Author 刘洋
     * @Date 2023/5/13
     */
    //牌号
    public List<String> select_trademark();
    //热处理制度
    public List<String> select_heatTreatmentSystem();
    //大查询 持久性能
    public List<DurablePerformance> select_durable_performance(@Param("trademark") String trademark, @Param("heat_treatment_system") String heat_treatment_system, @Param("temperature_min") Long temperature_min, @Param("temperature_max") Long temperature_max,@Param("stress_min")Long stress_min,@Param("stress_max")Long stress_max);

    //查询最大最小温度
    public Long select_temperature_max();
    public Long select_temperature_min();
    //查询最大最小应力
    public Long select_stress_max();
    public Long select_stress_min();
}
