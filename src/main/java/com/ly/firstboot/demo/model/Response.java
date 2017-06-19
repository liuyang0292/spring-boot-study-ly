package com.ly.firstboot.demo.model;

/**
 * Created by lyy on 2017-06-17.
 */
public class Response<T> {

    private T data;

    private String msg;

    private Integer code;

    public Response(){
    }

    public Response(T data){
        this.data=data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
