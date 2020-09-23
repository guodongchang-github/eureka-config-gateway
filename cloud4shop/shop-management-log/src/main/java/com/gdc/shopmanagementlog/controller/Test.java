package com.gdc.shopmanagementlog.controller;

import com.gdc.shopmanagementlog.dao.OperateLogDao;
import com.gdc.shopmanagementlog.entity.OperateLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {

    @Autowired
    private OperateLogDao operateLogDao;

    @Value(value = "${user.username}")
    public String username;
    @Value(value = "${user.password}")
    public String password;

    @RequestMapping("hello")
    public Object hello() {
        return username+"5555"+password;
    }

    @RequestMapping("hello2")
    public String hello2() {

        //List<OperateLog> operateLog = operateLogDao.findOperateLog();
        //System.out.println(operateLog);
        return "helloword";
    }
}
