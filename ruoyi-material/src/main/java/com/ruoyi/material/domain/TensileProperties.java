package com.ruoyi.material.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 tensile_properties
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
public class TensileProperties extends BaseEntity
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
    private Long yieldStrength;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tensileStrength;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long elongation;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sectionShrinkage;

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
    public void setYieldStrength(Long yieldStrength) 
    {
        this.yieldStrength = yieldStrength;
    }

    public Long getYieldStrength() 
    {
        return yieldStrength;
    }
    public void setTensileStrength(Long tensileStrength) 
    {
        this.tensileStrength = tensileStrength;
    }

    public Long getTensileStrength() 
    {
        return tensileStrength;
    }
    public void setElongation(Long elongation) 
    {
        this.elongation = elongation;
    }

    public Long getElongation() 
    {
        return elongation;
    }
    public void setSectionShrinkage(Long sectionShrinkage) 
    {
        this.sectionShrinkage = sectionShrinkage;
    }

    public Long getSectionShrinkage() 
    {
        return sectionShrinkage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("trademark", getTrademark())
            .append("heatTreatmentSystem", getHeatTreatmentSystem())
            .append("temperature", getTemperature())
            .append("yieldStrength", getYieldStrength())
            .append("tensileStrength", getTensileStrength())
            .append("elongation", getElongation())
            .append("sectionShrinkage", getSectionShrinkage())
            .toString();
    }
}
