package com.ruoyi.material.mapper;

import java.util.List;
import com.ruoyi.material.domain.PerformanceEntry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-08
 */
@Mapper
public interface PerformanceEntryMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePerformanceEntryByTrademark(String trademark);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePerformanceEntryByTrademarks(String[] trademarks);

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
    public List<PerformanceEntry> select_performance_entry(@Param("trademark") String trademark,@Param("T") Double T);
}
