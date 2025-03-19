package com.ruoyi.material.mapper;

import java.util.List;
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
public interface TensilePropertiesMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public TensileProperties selectTensilePropertiesByTrademark(String trademark);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tensileProperties 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TensileProperties> selectTensilePropertiesList(TensileProperties tensileProperties);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tensileProperties 【请填写功能名称】
     * @return 结果
     */
    public int insertTensileProperties(TensileProperties tensileProperties);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tensileProperties 【请填写功能名称】
     * @return 结果
     */
    public int updateTensileProperties(TensileProperties tensileProperties);

    /**
     * 删除【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTensilePropertiesByTrademark(String trademark);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTensilePropertiesByTrademarks(String[] trademarks);

    /**
     * @Author 刘洋
     * @Date 2023/5/3
     */
    //牌号
    public List<String> select_trademark();
    //热处理制度
    public List<String> select_heatTreatmentSystem();
    //大查询 拉伸性能
    public List<TensileProperties> select_tensile_properties(@Param("trademark") String trademark,@Param("heat_treatment_system") String heat_treatment_system,@Param("temperature_min") Long temperature_min,@Param("temperature_max") Long temperature_max);

    //查询最大最小温度
    public Long select_temperature_max();
    public Long select_temperature_min();
}
