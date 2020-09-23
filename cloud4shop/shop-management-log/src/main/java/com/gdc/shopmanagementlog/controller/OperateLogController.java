package com.gdc.shopmanagementlog.controller;

import com.gdc.shopmanagementlog.entity.OperateLog;
import com.gdc.shopmanagementlog.service.IOperateLogService;
import com.gdc.shopmanagementlog.util.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperateLogController {
    @Autowired
    private IOperateLogService operateLogServiceImpl;

    @RequestMapping(value = "/getOperateLog")
    public Data getOperateLog(OperateLog operateLog) {
        operateLog.setPage(1);
        operateLog.setPageSize(10);
        Data data=null;
        try{
            data = operateLogServiceImpl.getOperateLog(operateLog);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(data.toString());
        return data;
    }

}
