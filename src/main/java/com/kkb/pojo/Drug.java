package com.kkb.pojo;

public class Drug {
    private Integer dr_id;

    private String dr_url;

    private Double dr_inPrice;

    private Double dr_outPrice;

    private String dr_name;

    private String dr_type;

    private String dr_simDesc;

    private String dr_life;

    private String dr_detaDesc;

    private String dr_fatory;

    private String dr_remark;

    private Integer dr_number;

    public Integer getDr_id() {
        return dr_id;
    }

    public void setDr_id(Integer dr_id) {
        this.dr_id = dr_id;
    }

    public String getDr_url() {
        return dr_url;
    }

    public void setDr_url(String dr_url) {
        this.dr_url = dr_url == null ? null : dr_url.trim();
    }

    public Double getDr_inPrice() {
        return dr_inPrice;
    }

    public void setDr_inPrice(Double dr_inPrice) {
        this.dr_inPrice = dr_inPrice;
    }

    public Double getDr_outPrice() {
        return dr_outPrice;
    }

    public void setDr_outPrice(Double dr_outPrice) {
        this.dr_outPrice = dr_outPrice;
    }

    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name == null ? null : dr_name.trim();
    }

    public String getDr_type() {
        return dr_type;
    }

    public void setDr_type(String dr_type) {
        this.dr_type = dr_type == null ? null : dr_type.trim();
    }

    public String getDr_simDesc() {
        return dr_simDesc;
    }

    public void setDr_simDesc(String dr_simDesc) {
        this.dr_simDesc = dr_simDesc == null ? null : dr_simDesc.trim();
    }

    public String getDr_life() {
        return dr_life;
    }

    public void setDr_life(String dr_life) {
        this.dr_life = dr_life == null ? null : dr_life.trim();
    }

    public String getDr_detaDesc() {
        return dr_detaDesc;
    }

    public void setDr_detaDesc(String dr_detaDesc) {
        this.dr_detaDesc = dr_detaDesc == null ? null : dr_detaDesc.trim();
    }

    public String getDr_fatory() {
        return dr_fatory;
    }

    public void setDr_fatory(String dr_fatory) {
        this.dr_fatory = dr_fatory == null ? null : dr_fatory.trim();
    }

    public String getDr_remark() {
        return dr_remark;
    }

    public void setDr_remark(String dr_remark) {
        this.dr_remark = dr_remark == null ? null : dr_remark.trim();
    }

    public Integer getDr_number() {
        return dr_number;
    }

    public void setDr_number(Integer dr_number) {
        this.dr_number = dr_number;
    }
}