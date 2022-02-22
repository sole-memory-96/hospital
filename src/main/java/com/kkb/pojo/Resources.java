package com.kkb.pojo;

public class Resources {
    private Integer resid;

    private String resname;

    private String resurl;

    private Integer resparentid;

    public Integer getResid() {
        return resid;
    }

    public void setResid(Integer resid) {
        this.resid = resid;
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname == null ? null : resname.trim();
    }

    public String getResurl() {
        return resurl;
    }

    public void setResurl(String resurl) {
        this.resurl = resurl == null ? null : resurl.trim();
    }

    public Integer getResparentid() {
        return resparentid;
    }

    public void setResparentid(Integer resparentid) {
        this.resparentid = resparentid;
    }
}