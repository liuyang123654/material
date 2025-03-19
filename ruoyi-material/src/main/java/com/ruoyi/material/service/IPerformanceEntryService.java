package com.ruoyi.material.service;

import java.util.List;
import com.ruoyi.material.domain.PerformanceEntry;


/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-06-08
 */


public interface IPerformanceEntryService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public PerformanceEntry selectPerformanceEntryByTrademark(String trademark);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param performanceEntry 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<PerformanceEntry> selectPerformanceEntryList(PerformanceEntry performanceEntry);

    /**
     * 新增【请填写功能名称】
     * 
     * @param performanceEntry 【请填写功能名称】
     * @return 结果
     */
    public int insertPerformanceEntry(PerformanceEntry performanceEntry);

    /**
     * 修改【请填写功能名称】
     * 
     * @param performanceEntry 【请填写功能名称】
     * @return 结果
     */
    public int updatePerformanceEntry(PerformanceEntry performanceEntry);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deletePerformanceEntryByTrademarks(String[] trademarks);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePerformanceEntryByTrademark(String trademark);

    /*
    @Author 刘洋
    @Date 2023/6/8
     */
    //查询最小
    public String select_min();
    //查询最大
    public String select_max();
    //查询牌号
    public List<String> select_trademark();

    //查询所有
    public List<PerformanceEntry> select_performance_entry(String trademark,Double T);


}
