package com.ruoyi.material.domain;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 durable_performance
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
public class DurablePerformance extends BaseEntity
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
    private Long stress;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long τ_min;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long τ_max;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double elongation;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double sectionShrinkage;

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
    public void setStress(Long stress) 
    {
        this.stress = stress;
    }

    public Long getStress() 
    {
        return stress;
    }
    public void setΤ_min(Long τ_min) 
    {
        this.τ_min = τ_min;
    }

    public Long getΤ_min() 
    {
        return τ_min;
    }
    public void setΤ_max(Long τ_max) 
    {
        this.τ_max = τ_max;
    }

    public Long getΤ_max() 
    {
        return τ_max;
    }
    public void setElongation(Double elongation)
    {
        this.elongation = elongation;
    }

    public Double getElongation()
    {
        return elongation;
    }
    public void setSectionShrinkage(Double sectionShrinkage)
    {
        this.sectionShrinkage = sectionShrinkage;
    }

    public Double getSectionShrinkage()
    {
        return sectionShrinkage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("trademark", getTrademark())
            .append("heatTreatmentSystem", getHeatTreatmentSystem())
            .append("temperature", getTemperature())
            .append("stress", getStress())
            .append("τ_min", getΤ_min())
            .append("τ_max", getΤ_max())
            .append("elongation", getElongation())
            .append("sectionShrinkage", getSectionShrinkage())
            .toString();
    }
}
