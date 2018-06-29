package com.mnnyang.hqu.data.bean;



public class Version {


    private int version;
    private String code;
    private String msg;

    public int getVersion() {
        return version;
    }

    public Version setVersion(int version) {
        this.version = version;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Version setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Version setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
