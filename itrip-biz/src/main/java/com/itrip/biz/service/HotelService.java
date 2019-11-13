package com.itrip.biz.service;

import com.itrip.beans.pojo.Hotel;
import com.itrip.utils.Page;

/**
 * 酒店的业务逻辑接口
 */
public interface HotelService {
    /**
     * 查询分页的酒店信息
     * @param currentCount  当前页码
     * @param pageSize  页大小
     * @param cityId  城市id
     * @return
     */
    Page<Hotel> getPagedHotelByCityId(int currentCount,int pageSize,int cityId);
}
