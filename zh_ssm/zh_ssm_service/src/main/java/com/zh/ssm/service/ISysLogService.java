package com.zh.ssm.service;

import com.zh.ssm.domain.SysLog;

import java.util.List;

public interface ISysLogService {


    void save(SysLog sysLog) throws Exception;

//    List<SysLog> findAll() throws Exception;
    List<SysLog> findAll() throws Exception;

}
