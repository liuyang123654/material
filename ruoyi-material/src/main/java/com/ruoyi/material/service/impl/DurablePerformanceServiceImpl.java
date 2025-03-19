package com.ruoyi.material.service.impl;

import java.util.List;

import com.ruoyi.material.domain.TensileProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.material.mapper.DurablePerformanceMapper;
import com.ruoyi.material.domain.DurablePerformance;
import com.ruoyi.material.service.IDurablePerformanceService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@Service
public class DurablePerformanceServiceImpl implements IDurablePerformanceService 
{
    @Autowired
    private DurablePerformanceMapper durablePerformanceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public DurablePerformance selectDurablePerformanceByTrademark(String trademark)
    {
        return durablePerformanceMapper.selectDurablePerformanceByTrademark(trademark);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param durablePerformance 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DurablePerformance> selectDurablePerformanceList(DurablePerformance durablePerformance)
    {
        return durablePerformanceMapper.selectDurablePerformanceList(durablePerformance);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param durablePerformance 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDurablePerformance(DurablePerformance durablePerformance)
    {
        return durablePerformanceMapper.insertDurablePerformance(durablePerformance);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param durablePerformance 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDurablePerformance(DurablePerformance durablePerformance)
    {
        return durablePerformanceMapper.updateDurablePerformance(durablePerformance);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDurablePerformanceByTrademarks(String[] trademarks)
    {
        return durablePerformanceMapper.deleteDurablePerformanceByTrademarks(trademarks);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDurablePerformanceByTrademark(String trademark)
    {
        return durablePerformanceMapper.deleteDurablePerformanceByTrademark(trademark);
    }
    /**
     * @Author 刘洋
     * @Date 2023/5/13
     */
    //牌号
    @Override
    public List<String> select_trademark()
    {
        return durablePerformanceMapper.select_trademark();
    }
    //热处理制度
    @Override
    public List<String> select_heatTreatmentSystem()
    {
        return durablePerformanceMapper.select_heatTreatmentSystem();
    }

    //大查询 持久性能
    @Override
    public List<DurablePerformance> select_durable_performance(String trademark, String heat_treatment_system, Long temperature_min, Long temperature_max,Long stress_min, Long stress_max)
    {
        return durablePerformanceMapper.select_durable_performance(trademark,heat_treatment_system,temperature_min,temperature_max,stress_min,stress_max);
    }

    @Override
    //查询最大最小温度
    public Long select_temperature_max(){
        return durablePerformanceMapper.select_temperature_max();
    }
    public Long select_temperature_min(){
        return durablePerformanceMapper.select_temperature_min();
    }
    //查询最大最小应力
    public Long select_stress_max(){
        return durablePerformanceMapper.select_stress_max();
    }
    public Long select_stress_min(){
        return durablePerformanceMapper.select_stress_min();
    }
}
