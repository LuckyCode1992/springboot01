package com.hxl.hxlspringboot01.entity;

public class LoginInfo {
    private String account;
    private String pwd;

    public LoginInfo() {
    }

    public LoginInfo(String account, String pwd) {
        this.account = account;
        this.pwd = pwd;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
