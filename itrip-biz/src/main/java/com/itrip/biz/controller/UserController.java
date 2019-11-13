package com.itrip.biz.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.User;
import com.itrip.biz.service.UserService;
import com.itrip.utils.DtoUtil;
import com.itrip.utils.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/api")
public class UserController {
    @Resource
    UserService uService;

    @RequestMapping("/user/queryUserPage")
    public Dto userPage(@RequestParam(value = "currentCount",defaultValue = "1") int currentCount){
        int pageSize=3;
        Page<User> userPage = uService.getUserPage(currentCount, pageSize);
        if(userPage.getList().size()>0){
            return DtoUtil.returnSuccess(userPage,"success");
        }else{
            return DtoUtil.returnSuccess("not data");
        }
    }
}
