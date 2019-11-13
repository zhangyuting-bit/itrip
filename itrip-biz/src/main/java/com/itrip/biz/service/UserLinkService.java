package com.itrip.biz.service;

import com.itrip.beans.pojo.UserLink;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLinkService {
    List<UserLink> getUserLinkByName(String linkUserName);
}
