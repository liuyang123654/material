package com.ruoyi.material.service;

import java.util.List;
import com.ruoyi.material.domain.TensileProperties;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
public interface ITensilePropertiesService 
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
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteTensilePropertiesByTrademarks(String[] trademarks);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTensilePropertiesByTrademark(String trademark);

    /**
     * @Author 刘洋
     * @Date 2023/5/3
     */
    //牌号
    public List<String> select_trademark();
    //热处理制度
    public List<String> select_heatTreatmentSystem();
    //大查询 拉伸性能
    public List<TensileProperties> select_tensile_properties(String trademark,String heat_treatment_system,Long temperature_min,Long temperature_max);

    //预测功能
    public String[] predict_tensile_properties(String trademark, String heat_treatment_system, String temperature, String algorithms);

    //查询最大最小温度
    public Long select_temperature_max();
    public Long select_temperature_min();
}
