package com.ruoyi.material.service.impl;

import java.util.List;

import com.ruoyi.material.domain.Creep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.material.mapper.CreepMapper;
import com.ruoyi.material.domain.Creep;
import com.ruoyi.material.service.ICreepService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@Service
public class CreepServiceImpl implements ICreepService 
{
    @Autowired
    private CreepMapper creepMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Creep selectCreepByTrademark(String trademark)
    {
        return creepMapper.selectCreepByTrademark(trademark);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param creep 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Creep> selectCreepList(Creep creep)
    {
        return creepMapper.selectCreepList(creep);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param creep 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCreep(Creep creep)
    {
        return creepMapper.insertCreep(creep);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param creep 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCreep(Creep creep)
    {
        return creepMapper.updateCreep(creep);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCreepByTrademarks(String[] trademarks)
    {
        return creepMapper.deleteCreepByTrademarks(trademarks);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCreepByTrademark(String trademark)
    {
        return creepMapper.deleteCreepByTrademark(trademark);
    }


    /**
     * @Author 刘洋
     * @Date 2023/5/20
     */
    //牌号
    @Override
    public List<String> select_trademark()
    {
        return creepMapper.select_trademark();
    }
    //热处理制度
    @Override
    public List<String> select_heatTreatmentSystem()
    {
        return creepMapper.select_heatTreatmentSystem();
    }

    //大查询 持久性能
    @Override
    public List<Creep> select_creep(String trademark, String heat_treatment_system, Long temperature_min, Long temperature_max,Long time_min,Long time_max, Long stress_min, Long stress_max)
    {
        return creepMapper.select_creep(trademark,heat_treatment_system,temperature_min,temperature_max,time_min,time_max,stress_min,stress_max);
    }
    @Override
    //查询最大最小温度
    public Long select_temperature_max()
    {
        return creepMapper.select_temperature_max();
    }
    public Long select_temperature_min(){
        return creepMapper.select_temperature_min();
    }

    //查询最大最小时间
    public Long select_time_max()
    {
        return creepMapper.select_time_max();
    }
    public Long select_time_min()
    {
        return creepMapper.select_time_min();
    }
    //查询最大最小应力
    public Long select_stress_max()
    {
        return creepMapper.select_stress_max();
    }
    public Long select_stress_min()
    {
        return creepMapper.select_stress_min();
    }
}
