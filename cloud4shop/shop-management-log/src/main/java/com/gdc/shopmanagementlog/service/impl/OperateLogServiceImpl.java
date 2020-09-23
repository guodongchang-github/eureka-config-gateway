package com.gdc.shopmanagementlog.service.impl;

import com.gdc.shopmanagementlog.dao.OperateLogDao;
import com.gdc.shopmanagementlog.entity.OperateLog;
import com.gdc.shopmanagementlog.service.IOperateLogService;
import com.gdc.shopmanagementlog.util.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OperateLogServiceImpl implements IOperateLogService {
    @Autowired
    private OperateLogDao operateLogDao;

    @Override
    public Data getOperateLog(OperateLog operateLog) {
        //分页条件查询操作日志
        List<OperateLog> operateLogList = operateLogDao.findOperateLog(operateLog);
        //获取所有操作日志
        List<OperateLog> operateLog4Size = operateLogDao.findOperateLog4Size(operateLog);

        Data data = new Data();
        data.setData(operateLogList);
        data.setCount(operateLog4Size.size());
        data.setPageNum(operateLog.getPage());
        data.setPageSize(operateLog.getPageSize());
        return data;
    }
}
