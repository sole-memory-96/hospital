package com.kkb.vo;

import com.github.pagehelper.PageInfo;

import java.util.List;

public class ResultVO<T> {
    private PageInfo<T> pageInfo;//返回的是分页对象
    private List<T> list;//返回的是集合
    private T obj;//返回的是单个对象
    private Integer code=200;//表示返回的状态码
    private String msg="ok";//表示可以展示给用户的信息


    public ResultVO() {
    }

    public ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(PageInfo<T> pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ResultVO(List<T> list) {
        this.list = list;
    }

    public ResultVO(T obj) {
        this.obj = obj;
    }

    public PageInfo<T> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<T> pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
