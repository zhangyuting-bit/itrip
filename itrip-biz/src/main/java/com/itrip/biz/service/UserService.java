package com.itrip.biz.service;

import com.itrip.beans.pojo.User;
import com.itrip.utils.Page;

public interface UserService {
    Page<User> getUserPage(int currentCount,int pageSize);
}
