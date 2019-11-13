package com.itrip.dao.userlink;

import com.itrip.beans.pojo.UserLink;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLinkMapper {
    List<UserLink> getUserLinkByName(@Param("linkUserName") String linkUserName);
}
