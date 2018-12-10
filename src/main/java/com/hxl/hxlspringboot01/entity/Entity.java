package com.hxl.hxlspringboot01.entity;

public class Entity {

    private int code;
    private String message;
    private UserInfo body;

    public Entity(int code, String message, UserInfo body) {
        this.code = code;
        this.message = message;
        this.body = body;
    }

    public Entity() {
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserInfo getBody() {
        return body;
    }

    public void setBody(UserInfo body) {
        this.body = body;
    }
}
