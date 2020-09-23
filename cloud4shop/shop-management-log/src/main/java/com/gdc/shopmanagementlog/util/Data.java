package com.gdc.shopmanagementlog.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回实体
 */
public class Data {

    private Integer code;//状态吗
    private String msg;//信息
    private List<?> data;//数据
    private Integer pageNum;//当前页
    private Integer pageSize;//一页多少条数据
    private Integer count;//一共多少条数据

    public Data() {
    }

    public Data(Integer code, String msg, List<?> data, Integer pageNum, Integer pageSize, Integer count) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.count = count;
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

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Data{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", count=" + count +
                '}';
    }

}
