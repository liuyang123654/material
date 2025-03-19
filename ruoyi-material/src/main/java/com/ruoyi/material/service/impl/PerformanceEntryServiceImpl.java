package com.ruoyi.material.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.material.mapper.PerformanceEntryMapper;
import com.ruoyi.material.domain.PerformanceEntry;
import com.ruoyi.material.service.IPerformanceEntryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-08
 */
@Service
public class PerformanceEntryServiceImpl implements IPerformanceEntryService 
{
    @Autowired
    private PerformanceEntryMapper performanceEntryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public PerformanceEntry selectPerformanceEntryByTrademark(String trademark)
    {
        return performanceEntryMapper.selectPerformanceEntryByTrademark(trademark);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param performanceEntry 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<PerformanceEntry> selectPerformanceEntryList(PerformanceEntry performanceEntry)
    {
        return performanceEntryMapper.selectPerformanceEntryList(performanceEntry);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param performanceEntry 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPerformanceEntry(PerformanceEntry performanceEntry)
    {
        return performanceEntryMapper.insertPerformanceEntry(performanceEntry);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param performanceEntry 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePerformanceEntry(PerformanceEntry performanceEntry)
    {
        return performanceEntryMapper.updatePerformanceEntry(performanceEntry);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePerformanceEntryByTrademarks(String[] trademarks)
    {
        return performanceEntryMapper.deletePerformanceEntryByTrademarks(trademarks);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePerformanceEntryByTrademark(String trademark)
    {
        return performanceEntryMapper.deletePerformanceEntryByTrademark(trademark);
    }


    @Override
    public String select_min() {
        return performanceEntryMapper.select_min();
    }

    @Override
    public String select_max() {
        return performanceEntryMapper.select_max();
    }
    @Override
    public List<String> select_trademark()
    {
        return performanceEntryMapper.select_trademark();
    }

    @Override
    public List<PerformanceEntry> select_performance_entry(String trademark, Double T) {
        return performanceEntryMapper.select_performance_entry(trademark,T);
    }


}
