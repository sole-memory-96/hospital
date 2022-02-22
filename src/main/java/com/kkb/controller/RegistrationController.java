package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Hosregister;
import com.kkb.service.RegistrationService;
import com.kkb.vo.QueryRegistrationVO;
import com.kkb.vo.ResultVO;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/registration")
@ResponseBody
public class RegistrationController {

    @Resource
    public RegistrationService registrationService;

    @InitBinder
    protected void initDateFormatBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResultVO<Hosregister> getAll(Integer pageNum, Integer pageSize, QueryRegistrationVO vo){
        if(pageNum==null || pageNum<=0){
            pageNum=1;
        }
        if(pageSize==null || pageSize<=0){
            pageSize=5;
        }
        PageInfo<Hosregister> hosregisterPageInfo = registrationService.queryByPage(pageNum,pageSize,vo);
        return new ResultVO<>(hosregisterPageInfo);
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public ResultVO<Hosregister> insert(Hosregister hosregister){
        System.out.println(hosregister);
        hosregister.setHos_state(1);
        hosregister.setHos_date(new Date());
        int i = registrationService.insert(hosregister);
        if(i==1){
            return new ResultVO<>();
        }else {
            return new ResultVO<>(500,"服务器内部异常，请稍候再试！");
        }
    }
}
