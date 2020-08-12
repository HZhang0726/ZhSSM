package com.zh.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.zh.ssm.dao.ISysLogDao;
import com.zh.ssm.domain.SysLog;
import com.zh.ssm.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private ISysLogDao sysLogDao;


    @Override
    public void save(SysLog sysLog) throws Exception {
        sysLogDao.save(sysLog);
    }


    @Override
    public List<SysLog> findAll() throws Exception{
//        PageHelper.startPage(pageNum, pageSize);

        return sysLogDao.findAll();
    }
}
