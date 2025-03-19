package com.ruoyi.material.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.web.bind.annotation.RequestParam;

public class Ten_Mentals_Value extends BaseEntity {
    //********属性名称必须小写，否则就要加@JsonProperty("")注解  这是驼峰命名规则***************
    @JsonProperty("Al")
    private Double Al;
    @JsonProperty("Ti")
    private Double Ti;
    @JsonProperty("Cr")
    private Double Cr;
    @JsonProperty("Co")
    private Double Co;
    @JsonProperty("Ni")
    private Double Ni;
    @JsonProperty("Nb")
    private Double Nb;
    @JsonProperty("Mo")
    private Double Mo;
    @JsonProperty("Hf")
    private Double Hf;
    @JsonProperty("Ta")
    private Double Ta;
    @JsonProperty("W")
    private Double W;
    @JsonProperty("table_name1")
    private String table_name1;

    public String getTable_name1() {
        return table_name1;
    }

    public void setTable_name1(String table_name1) {
        this.table_name1 = table_name1;
    }

    public String getTable_name2() {
        return table_name2;
    }

    public void setTable_name2(String table_name2) {
        this.table_name2 = table_name2;
    }

    @JsonProperty("table_name2")
    private String table_name2;

    public Double getAl() {
        return Al;
    }

    public void setAl(Double al) {
        Al = al;
    }

    public Double getTi() {
        return Ti;
    }

    public void setTi(Double ti) {
        Ti = ti;
    }

    public Double getCr() {
        return Cr;
    }

    public void setCr(Double cr) {
        Cr = cr;
    }

    public Double getCo() {
        return Co;
    }

    public void setCo(Double co) {
        Co = co;
    }

    public Double getNi() {
        return Ni;
    }

    public void setNi(Double ni) {
        Ni = ni;
    }

    public Double getNb() {
        return Nb;
    }

    public void setNb(Double nb) {
        Nb = nb;
    }

    public Double getMo() {
        return Mo;
    }

    public void setMo(Double mo) {
        Mo = mo;
    }

    public Double getHf() {
        return Hf;
    }

    public void setHf(Double hf) {
        Hf = hf;
    }

    public Double getTa() {
        return Ta;
    }

    public void setTa(Double ta) {
        Ta = ta;
    }

    public Double getW() {
        return W;
    }

    public void setW(Double w) {
        W = w;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("table_name1",getTable_name1())
                .append("table_name2",getTable_name2())
                .append("Al", getAl())
                .append("Ti", getTi())
                .append("Cr", getCr())
                .append("Co", getCo())
                .append("Ni", getNi())
                .append("Nb", getNb())
                .append("Mo", getMo())
                .append("Hf", getHf())
                .append("Ta", getTa())
                .append("W", getW())
                .toString();


    }
}
