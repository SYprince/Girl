package com.wangzi.girl.entity;

/**
 * http请求返回的 (最外层的)json 信息实体
 */
public class Result<T> {

    /**错误码*/
    private Integer code;

    /** 提示信息*/
    private String msg;

    /** 返回内容*/
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
