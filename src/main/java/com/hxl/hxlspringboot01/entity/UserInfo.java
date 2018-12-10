package com.hxl.hxlspringboot01.entity;

public class UserInfo {
    private String name;
    private int age;
    private String work;
    private String account;
    private String pwd;

    public UserInfo() {
    }

    public UserInfo(String name, int age, String work, String account, String pwd) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.account = account;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
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
