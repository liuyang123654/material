package com.ruoyi.material.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 enduring_limits
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
public class EnduringLimits extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String trademark;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String heatTreatmentSystem;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long temperature;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long time;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long enduringLimits;

    public void setTrademark(String trademark) 
    {
        this.trademark = trademark;
    }

    public String getTrademark() 
    {
        return trademark;
    }
    public void setHeatTreatmentSystem(String heatTreatmentSystem) 
    {
        this.heatTreatmentSystem = heatTreatmentSystem;
    }

    public String getHeatTreatmentSystem() 
    {
        return heatTreatmentSystem;
    }
    public void setTemperature(Long temperature) 
    {
        this.temperature = temperature;
    }

    public Long getTemperature() 
    {
        return temperature;
    }
    public void setTime(Long time) 
    {
        this.time = time;
    }

    public Long getTime() 
    {
        return time;
    }
    public void setEnduringLimits(Long enduringLimits) 
    {
        this.enduringLimits = enduringLimits;
    }

    public Long getEnduringLimits() 
    {
        return enduringLimits;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("trademark", getTrademark())
            .append("heatTreatmentSystem", getHeatTreatmentSystem())
            .append("temperature", getTemperature())
            .append("time", getTime())
            .append("enduringLimits", getEnduringLimits())
            .toString();
    }
}
