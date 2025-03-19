package com.ruoyi.material.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 creep
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
public class Creep extends BaseEntity
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
    private Long stress;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double εt_min;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double εt_max;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double εp_min;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double εp_max;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double εe_min;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double εe_max;

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
    public void setStress(Long stress) 
    {
        this.stress = stress;
    }

    public Long getStress() 
    {
        return stress;
    }
    public void setΕt_min(Double εt_min)
    {
        this.εt_min = εt_min;
    }

    public Double getΕt_min()
    {
        return εt_min;
    }
    public void setΕt_max(Double εt_max)
    {
        this.εt_max = εt_max;
    }

    public Double getΕt_max()
    {
        return εt_max;
    }
    public void setΕp_min(Double εp_min)
    {
        this.εp_min = εp_min;
    }

    public Double getΕp_min()
    {
        return εp_min;
    }
    public void setΕp_max(Double εp_max)
    {
        this.εp_max = εp_max;
    }

    public Double getΕp_max()
    {
        return εp_max;
    }
    public void setΕe_min(Double εe_min)
    {
        this.εe_min = εe_min;
    }

    public Double getΕe_min()
    {
        return εe_min;
    }
    public void setΕe_max(Double εe_max)
    {
        this.εe_max = εe_max;
    }

    public Double getΕe_max()
    {
        return εe_max;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("trademark", getTrademark())
            .append("heatTreatmentSystem", getHeatTreatmentSystem())
            .append("temperature", getTemperature())
            .append("time", getTime())
            .append("stress", getStress())
            .append("εt_min", getΕt_min())
            .append("εt_max", getΕt_max())
            .append("εp_min", getΕp_min())
            .append("εp_max", getΕp_max())
            .append("εe_min", getΕe_min())
            .append("εe_max", getΕe_max())
            .toString();
    }
}
