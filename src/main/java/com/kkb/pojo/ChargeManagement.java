package com.kkb.pojo;

public class ChargeManagement {
    private Integer chaP_id;

    private String chaP_name;

    private Double chaP_money;

    public Integer getChaP_id() {
        return chaP_id;
    }

    public void setChaP_id(Integer chaP_id) {
        this.chaP_id = chaP_id;
    }

    public String getChaP_name() {
        return chaP_name;
    }

    public void setChaP_name(String chaP_name) {
        this.chaP_name = chaP_name == null ? null : chaP_name.trim();
    }

    public Double getChaP_money() {
        return chaP_money;
    }

    public void setChaP_money(Double chaP_money) {
        this.chaP_money = chaP_money;
    }
}