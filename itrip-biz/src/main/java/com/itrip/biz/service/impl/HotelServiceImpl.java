package com.itrip.biz.service.impl;

import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.HotelService;
import com.itrip.dao.hotel.HotelMapper;
import com.itrip.utils.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 酒店的业务逻辑实现类
 */
@Service
public class HotelServiceImpl implements HotelService {
    @Resource
    HotelMapper hMapper;

    @Override
    public Page<Hotel> getPagedHotelByCityId(int currentCount, int pageSize, int cityId) {
        int from=(currentCount-1)*pageSize;
        List<Hotel> list = hMapper.getHotelListByCityId(from, pageSize, cityId);
        int totalCount = hMapper.getCount(cityId);
        Page<Hotel> pagedHotels=new Page<>(pageSize,currentCount,totalCount,list);
        return pagedHotels;
    }
}
