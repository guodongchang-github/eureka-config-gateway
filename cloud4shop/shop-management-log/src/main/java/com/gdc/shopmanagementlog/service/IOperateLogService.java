package com.gdc.shopmanagementlog.service;

import com.gdc.shopmanagementlog.entity.OperateLog;
import com.gdc.shopmanagementlog.util.Data;
import org.springframework.stereotype.Service;

@Service
public interface IOperateLogService {
    //分页查询操作日志
    public Data getOperateLog (OperateLog operateLog) ;




}
