package com.gdc.shopmanagementlog.dao;

import com.gdc.shopmanagementlog.entity.OperateLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface OperateLogDao {
    //分页查询操作日志
    public List<OperateLog> findOperateLog (OperateLog operateLog) ;
    //查询操作日志
    public List<OperateLog> findOperateLog4Size (OperateLog operateLog) ;
}
