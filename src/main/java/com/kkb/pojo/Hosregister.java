package com.kkb.pojo;

import java.util.Date;

public class Hosregister {
    private Integer hos_id;

    private String hos_name;

    private String hos_idCard;

    private String hos_medical;

    private Double hos_regPrice;

    private String hos_phone;

    private Integer hos_selfPrice;

    private Integer hos_sex;

    private Integer hos_age;

    private String hos_work;

    private Integer hos_lookDoctor;

    private Integer d_id;

    private String hos_remark;

    private Integer hos_state;

    private Date hos_date;

    public Integer getHos_id() {
        return hos_id;
    }

    public void setHos_id(Integer hos_id) {
        this.hos_id = hos_id;
    }

    public String getHos_name() {
        return hos_name;
    }

    public void setHos_name(String hos_name) {
        this.hos_name = hos_name == null ? null : hos_name.trim();
    }

    public String getHos_idCard() {
        return hos_idCard;
    }

    public void setHos_idCard(String hos_idCard) {
        this.hos_idCard = hos_idCard == null ? null : hos_idCard.trim();
    }

    public String getHos_medical() {
        return hos_medical;
    }

    public void setHos_medical(String hos_medical) {
        this.hos_medical = hos_medical == null ? null : hos_medical.trim();
    }

    public Double getHos_regPrice() {
        return hos_regPrice;
    }

    public void setHos_regPrice(Double hos_regPrice) {
        this.hos_regPrice = hos_regPrice;
    }

    public String getHos_phone() {
        return hos_phone;
    }

    public void setHos_phone(String hos_phone) {
        this.hos_phone = hos_phone == null ? null : hos_phone.trim();
    }

    public Integer getHos_selfPrice() {
        return hos_selfPrice;
    }

    public void setHos_selfPrice(Integer hos_selfPrice) {
        this.hos_selfPrice = hos_selfPrice;
    }

    public Integer getHos_sex() {
        return hos_sex;
    }

    public void setHos_sex(Integer hos_sex) {
        this.hos_sex = hos_sex;
    }

    public Integer getHos_age() {
        return hos_age;
    }

    public void setHos_age(Integer hos_age) {
        this.hos_age = hos_age;
    }

    public String getHos_work() {
        return hos_work;
    }

    public void setHos_work(String hos_work) {
        this.hos_work = hos_work == null ? null : hos_work.trim();
    }

    public Integer getHos_lookDoctor() {
        return hos_lookDoctor;
    }

    public void setHos_lookDoctor(Integer hos_lookDoctor) {
        this.hos_lookDoctor = hos_lookDoctor;
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getHos_remark() {
        return hos_remark;
    }

    public void setHos_remark(String hos_remark) {
        this.hos_remark = hos_remark == null ? null : hos_remark.trim();
    }

    public Integer getHos_state() {
        return hos_state;
    }

    public void setHos_state(Integer hos_state) {
        this.hos_state = hos_state;
    }

    public Date getHos_date() {
        return hos_date;
    }

    public void setHos_date(Date hos_date) {
        this.hos_date = hos_date;
    }
}