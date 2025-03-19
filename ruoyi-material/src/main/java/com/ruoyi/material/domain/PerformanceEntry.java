package com.ruoyi.material.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 performance_entry
 * 
 * @author ruoyi
 * @date 2023-06-08
 */
public class PerformanceEntry extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String trademark;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double cMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double cMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double crMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double crMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double niMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double niMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double wMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double wMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double alMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double alMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double tiMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double tiMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double moMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double moMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double coMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double coMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double feMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double feMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double nbMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double nbMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double taMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double taMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double hfMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double hfMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double bMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double bMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double zrMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double zrMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double tMin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double tMax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double density;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String standardHeatTreatmentSystem;

    public void setTrademark(String trademark) 
    {
        this.trademark = trademark;
    }

    public String getTrademark() 
    {
        return trademark;
    }
    public void setcMin(Double cMin) 
    {
        this.cMin = cMin;
    }

    public Double getcMin() 
    {
        return cMin;
    }
    public void setcMax(Double cMax) 
    {
        this.cMax = cMax;
    }

    public Double getcMax() 
    {
        return cMax;
    }
    public void setCrMin(Double crMin) 
    {
        this.crMin = crMin;
    }

    public Double getCrMin() 
    {
        return crMin;
    }
    public void setCrMax(Double crMax) 
    {
        this.crMax = crMax;
    }

    public Double getCrMax() 
    {
        return crMax;
    }
    public void setNiMin(Double niMin) 
    {
        this.niMin = niMin;
    }

    public Double getNiMin() 
    {
        return niMin;
    }
    public void setNiMax(Double niMax) 
    {
        this.niMax = niMax;
    }

    public Double getNiMax() 
    {
        return niMax;
    }
    public void setwMin(Double wMin) 
    {
        this.wMin = wMin;
    }

    public Double getwMin() 
    {
        return wMin;
    }
    public void setwMax(Double wMax) 
    {
        this.wMax = wMax;
    }

    public Double getwMax() 
    {
        return wMax;
    }
    public void setAlMin(Double alMin) 
    {
        this.alMin = alMin;
    }

    public Double getAlMin() 
    {
        return alMin;
    }
    public void setAlMax(Double alMax) 
    {
        this.alMax = alMax;
    }

    public Double getAlMax() 
    {
        return alMax;
    }
    public void setTiMin(Double tiMin) 
    {
        this.tiMin = tiMin;
    }

    public Double getTiMin() 
    {
        return tiMin;
    }
    public void setTiMax(Double tiMax) 
    {
        this.tiMax = tiMax;
    }

    public Double getTiMax() 
    {
        return tiMax;
    }
    public void setMoMin(Double moMin) 
    {
        this.moMin = moMin;
    }

    public Double getMoMin() 
    {
        return moMin;
    }
    public void setMoMax(Double moMax) 
    {
        this.moMax = moMax;
    }

    public Double getMoMax() 
    {
        return moMax;
    }
    public void setCoMin(Double coMin) 
    {
        this.coMin = coMin;
    }

    public Double getCoMin() 
    {
        return coMin;
    }
    public void setCoMax(Double coMax) 
    {
        this.coMax = coMax;
    }

    public Double getCoMax() 
    {
        return coMax;
    }
    public void setFeMin(Double feMin) 
    {
        this.feMin = feMin;
    }

    public Double getFeMin() 
    {
        return feMin;
    }
    public void setFeMax(Double feMax) 
    {
        this.feMax = feMax;
    }

    public Double getFeMax() 
    {
        return feMax;
    }
    public void setNbMin(Double nbMin) 
    {
        this.nbMin = nbMin;
    }

    public Double getNbMin() 
    {
        return nbMin;
    }
    public void setNbMax(Double nbMax) 
    {
        this.nbMax = nbMax;
    }

    public Double getNbMax() 
    {
        return nbMax;
    }
    public void setTaMin(Double taMin) 
    {
        this.taMin = taMin;
    }

    public Double getTaMin() 
    {
        return taMin;
    }
    public void setTaMax(Double taMax) 
    {
        this.taMax = taMax;
    }

    public Double getTaMax() 
    {
        return taMax;
    }
    public void setHfMin(Double hfMin) 
    {
        this.hfMin = hfMin;
    }

    public Double getHfMin() 
    {
        return hfMin;
    }
    public void setHfMax(Double hfMax) 
    {
        this.hfMax = hfMax;
    }

    public Double getHfMax() 
    {
        return hfMax;
    }
    public void setbMin(Double bMin) 
    {
        this.bMin = bMin;
    }

    public Double getbMin() 
    {
        return bMin;
    }
    public void setbMax(Double bMax) 
    {
        this.bMax = bMax;
    }

    public Double getbMax() 
    {
        return bMax;
    }
    public void setZrMin(Double zrMin) 
    {
        this.zrMin = zrMin;
    }

    public Double getZrMin() 
    {
        return zrMin;
    }
    public void setZrMax(Double zrMax) 
    {
        this.zrMax = zrMax;
    }

    public Double getZrMax() 
    {
        return zrMax;
    }
    public void settMin(Double tMin) 
    {
        this.tMin = tMin;
    }

    public Double gettMin() 
    {
        return tMin;
    }
    public void settMax(Double tMax) 
    {
        this.tMax = tMax;
    }

    public Double gettMax() 
    {
        return tMax;
    }
    public void setdensity(Double density)
    {
        this.density = density;
    }

    public Double getdensity()
    {
        return density;
    }
    public void setStandardHeatTreatmentSystem(String standardHeatTreatmentSystem) 
    {
        this.standardHeatTreatmentSystem = standardHeatTreatmentSystem;
    }

    public String getStandardHeatTreatmentSystem() 
    {
        return standardHeatTreatmentSystem;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("trademark", getTrademark())
            .append("cMin", getcMin())
            .append("cMax", getcMax())
            .append("crMin", getCrMin())
            .append("crMax", getCrMax())
            .append("niMin", getNiMin())
            .append("niMax", getNiMax())
            .append("wMin", getwMin())
            .append("wMax", getwMax())
            .append("alMin", getAlMin())
            .append("alMax", getAlMax())
            .append("tiMin", getTiMin())
            .append("tiMax", getTiMax())
            .append("moMin", getMoMin())
            .append("moMax", getMoMax())
            .append("coMin", getCoMin())
            .append("coMax", getCoMax())
            .append("feMin", getFeMin())
            .append("feMax", getFeMax())
            .append("nbMin", getNbMin())
            .append("nbMax", getNbMax())
            .append("taMin", getTaMin())
            .append("taMax", getTaMax())
            .append("hfMin", getHfMin())
            .append("hfMax", getHfMax())
            .append("bMin", getbMin())
            .append("bMax", getbMax())
            .append("zrMin", getZrMin())
            .append("zrMax", getZrMax())
            .append("tMin", gettMin())
            .append("tMax", gettMax())
            .append("density", getdensity())
            .append("standardHeatTreatmentSystem", getStandardHeatTreatmentSystem())
            .toString();
    }
}
