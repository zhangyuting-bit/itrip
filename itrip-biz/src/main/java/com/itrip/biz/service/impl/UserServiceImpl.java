package com.itrip.biz.service.impl;

import com.itrip.beans.pojo.User;
import com.itrip.biz.service.UserService;
import com.itrip.dao.user.UserMapper;
import com.itrip.utils.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper uMapper;

    @Override
    public Page<User> getUserPage(int currentCount, int pageSize) {
        int from=(currentCount-1)*pageSize;
        List<User> list = uMapper.getUserPage(from, pageSize);
        int totalCount = uMapper.getUserCount();
        Page<User> page=new Page<User>(pageSize,currentCount,totalCount,list);
        return page;
    }
}
