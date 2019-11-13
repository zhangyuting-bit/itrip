package com.itrip.biz.service.impl;

import com.itrip.beans.pojo.UserLink;
import com.itrip.biz.service.UserLinkService;
import com.itrip.dao.userlink.UserLinkMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserLinkServiceImpl implements UserLinkService {
    @Resource
    UserLinkMapper ulMapper;
    @Override
    public List<UserLink> getUserLinkByName(String linkUserName) {
        return ulMapper.getUserLinkByName(linkUserName);
    }
}
