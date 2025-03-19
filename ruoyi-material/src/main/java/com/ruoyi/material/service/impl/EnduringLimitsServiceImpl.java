package com.ruoyi.material.service.impl;

import java.util.List;

import com.ruoyi.material.domain.DurablePerformance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.material.mapper.EnduringLimitsMapper;
import com.ruoyi.material.domain.EnduringLimits;
import com.ruoyi.material.service.IEnduringLimitsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@Service
public class EnduringLimitsServiceImpl implements IEnduringLimitsService 
{
    @Autowired
    private EnduringLimitsMapper enduringLimitsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public EnduringLimits selectEnduringLimitsByTrademark(String trademark)
    {
        return enduringLimitsMapper.selectEnduringLimitsByTrademark(trademark);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param enduringLimits 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<EnduringLimits> selectEnduringLimitsList(EnduringLimits enduringLimits)
    {
        return enduringLimitsMapper.selectEnduringLimitsList(enduringLimits);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param enduringLimits 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEnduringLimits(EnduringLimits enduringLimits)
    {
        return enduringLimitsMapper.insertEnduringLimits(enduringLimits);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param enduringLimits 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEnduringLimits(EnduringLimits enduringLimits)
    {
        return enduringLimitsMapper.updateEnduringLimits(enduringLimits);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEnduringLimitsByTrademarks(String[] trademarks)
    {
        return enduringLimitsMapper.deleteEnduringLimitsByTrademarks(trademarks);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEnduringLimitsByTrademark(String trademark)
    {
        return enduringLimitsMapper.deleteEnduringLimitsByTrademark(trademark);
    }

    /**
     * @Author 刘洋
     * @Date 2023/5/13
     */
    //牌号
    @Override
    public List<String> select_trademark()
    {
        return enduringLimitsMapper.select_trademark();
    }
    //热处理制度
    @Override
    public List<String> select_heatTreatmentSystem()
    {
        return enduringLimitsMapper.select_heatTreatmentSystem();
    }

    //大查询 持久性能
    @Override
    public List<EnduringLimits> select_enduring_limits(String trademark, String heat_treatment_system, Long temperature_min,Long temperature_max,Long time_min, Long time_max)
    {
        return enduringLimitsMapper.select_enduring_limits(trademark,heat_treatment_system,temperature_min,temperature_max,time_min,time_max);
    }

    @Override
    //查询最大最小温度
    public Long select_temperature_max(){
        return enduringLimitsMapper.select_temperature_max();
    }
    public Long select_temperature_min(){
        return enduringLimitsMapper.select_temperature_min();
    }

    //查询最大最小时间
    public Long select_time_max()
    {
        return enduringLimitsMapper.select_time_max();
    }
    public Long select_time_min(){
        return enduringLimitsMapper.select_time_min();
    }
}
