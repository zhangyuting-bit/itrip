package com.itrip.biz.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.UserLink;
import com.itrip.biz.service.UserLinkService;
import com.itrip.utils.DtoUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserLinkController {
    @Resource
    UserLinkService ulService;

    @RequestMapping("/userinfo/queryuserlinkuser")
    public Dto userInfo(@RequestParam(value = "linkUserName",required = false) String linkUserName){
        List<UserLink> userLink = ulService.getUserLinkByName(linkUserName);
        if(userLink.size()>0){
            return DtoUtil.returnSuccess(userLink,"OK");
        }else{
            return DtoUtil.returnUserLinkFail("获取常用联系人信息失败");
        }

    }
}
