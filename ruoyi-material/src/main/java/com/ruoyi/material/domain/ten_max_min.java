package com.ruoyi.material.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ten_max_min {
    private Double max_al;
    private Double min_al;
    private Double max_ti;
    private Double min_ti;
    private Double max_cr;
    private Double min_cr;
    private Double max_co;
    private Double min_co;
    private Double max_ni;
    private Double min_ni;
    private Double max_nb;
    private Double min_nb;
    private Double max_mo;
    private Double min_mo;
    private Double max_hf;
    private Double min_hf;
    private Double max_ta;
    private Double min_ta;
    private Double max_w;
    private Double min_w;

    public Double getMax_al() {
        return max_al;
    }

    public void setMax_al(Double max_al) {
        this.max_al = max_al;
    }

    public Double getMin_al() {
        return min_al;
    }

    public void setMin_al(Double min_al) {
        this.min_al = min_al;
    }

    public Double getMax_ti() {
        return max_ti;
    }

    public void setMax_ti(Double max_ti) {
        this.max_ti = max_ti;
    }

    public Double getMin_ti() {
        return min_ti;
    }

    public void setMin_ti(Double min_ti) {
        this.min_ti = min_ti;
    }

    public Double getMax_cr() {
        return max_cr;
    }

    public void setMax_cr(Double max_cr) {
        this.max_cr = max_cr;
    }

    public Double getMin_cr() {
        return min_cr;
    }

    public void setMin_cr(Double min_cr) {
        this.min_cr = min_cr;
    }

    public Double getMax_co() {
        return max_co;
    }

    public void setMax_co(Double max_co) {
        this.max_co = max_co;
    }

    public Double getMin_co() {
        return min_co;
    }

    public void setMin_co(Double min_co) {
        this.min_co = min_co;
    }

    public Double getMax_ni() {
        return max_ni;
    }

    public void setMax_ni(Double max_ni) {
        this.max_ni = max_ni;
    }

    public Double getMin_ni() {
        return min_ni;
    }

    public void setMin_ni(Double min_ni) {
        this.min_ni = min_ni;
    }

    public Double getMax_nb() {
        return max_nb;
    }

    public void setMax_nb(Double max_nb) {
        this.max_nb = max_nb;
    }

    public Double getMin_nb() {
        return min_nb;
    }

    public void setMin_nb(Double min_nb) {
        this.min_nb = min_nb;
    }

    public Double getMax_mo() {
        return max_mo;
    }

    public void setMax_mo(Double max_mo) {
        this.max_mo = max_mo;
    }

    public Double getMin_mo() {
        return min_mo;
    }

    public void setMin_mo(Double min_mo) {
        this.min_mo = min_mo;
    }

    public Double getMax_hf() {
        return max_hf;
    }

    public void setMax_hf(Double max_hf) {
        this.max_hf = max_hf;
    }

    public Double getMin_hf() {
        return min_hf;
    }

    public void setMin_hf(Double min_hf) {
        this.min_hf = min_hf;
    }

    public Double getMax_ta() {
        return max_ta;
    }

    public void setMax_ta(Double max_ta) {
        this.max_ta = max_ta;
    }

    public Double getMin_ta() {
        return min_ta;
    }

    public void setMin_ta(Double min_ta) {
        this.min_ta = min_ta;
    }

    public Double getMax_w() {
        return max_w;
    }

    public void setMax_w(Double max_w) {
        this.max_w = max_w;
    }

    public Double getMin_w() {
        return min_w;
    }

    public void setMin_w(Double min_w) {
        this.min_w = min_w;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("max_al", getMax_al())
                .append("min_al", getMin_al())
                .append("max_ti", getMax_ti())
                .append("min_ti", getMin_ti())
                .append("max_cr", getMax_cr())
                .append("min_cr", getMin_cr())
                .append("max_co", getMax_co())
                .append("min_co", getMin_co())
                .append("max_ni", getMax_ni())
                .append("min_ni", getMin_ni())
                .append("max_nb", getMax_nb())
                .append("min_nb", getMin_nb())
                .append("max_mo", getMax_mo())
                .append("min_mo", getMin_mo())
                .append("max_hf", getMax_hf())
                .append("min_hf", getMin_hf())
                .append("max_ta", getMax_ta())
                .append("min_ta", getMin_ta())
                .append("max_w", getMax_w())
                .append("min_w", getMin_w())
                .toString();
    }
}
