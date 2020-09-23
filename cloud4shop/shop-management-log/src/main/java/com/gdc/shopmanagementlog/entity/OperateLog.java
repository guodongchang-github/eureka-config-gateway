package com.gdc.shopmanagementlog.entity;

import java.util.Date;

public class OperateLog {

    private String id;
    //操作类型
    private String operateType;
    //描述
    private String description;
    //日期
    private Date date;
    //操作人
    private String operator;
    //ip
    private String ip;
    //当前页
    private int page;
    //一页多少数据
    private int pageSize;


    public OperateLog() {
    }

    public OperateLog(String id, String operateType, String description, Date date, String operator, String ip, int page, int pageSize) {
        this.id = id;
        this.operateType = operateType;
        this.description = description;
        this.date = date;
        this.operator = operator;
        this.ip = ip;
        this.page = page;
        this.pageSize = pageSize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "OperateLog{" +
                "id='" + id + '\'' +
                ", operateType='" + operateType + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", operator='" + operator + '\'' +
                ", ip='" + ip + '\'' +
                ", page=" + page +
                ", pageSize=" + pageSize +
                '}';
    }
}
