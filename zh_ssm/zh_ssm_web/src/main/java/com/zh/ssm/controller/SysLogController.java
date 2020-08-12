package com.zh.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.zh.ssm.domain.SysLog;
import com.zh.ssm.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sysLog")
public class SysLogController {

    @Autowired
    private ISysLogService sysLogService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv= new ModelAndView();
        List<SysLog> sysLogList = sysLogService.findAll();
        mv.addObject("sysLogs",sysLogList);
        mv.setViewName("syslog-list");

        return mv;
    }

//    @RequestMapping("/findAll.do")
//    @Secured("ROLE_ADMIN")
//    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer pageNum, @RequestParam(name = "pageSize", required = true, defaultValue = "10") Integer pageSize) throws Exception  {
//        ModelAndView mv = new ModelAndView();
//        List<SysLog> sysLogs = sysLogService.findAll(pageNum, pageSize);
//        PageInfo pageInfo = new PageInfo(sysLogs);
//        mv.addObject("pageInfo", pageInfo);
//        mv.setViewName("syslog-list");
//        return mv;
//    }
}
