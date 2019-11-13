package com.itrip.dao.hotel;

import com.itrip.beans.pojo.Hotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 酒店的数据访问接口
 */
public interface HotelMapper {
    /**
     * 根据城市id分页查询酒店信息
     */
    List<Hotel> getHotelListByCityId(@Param("from") int from,@Param("pageSize") int pageSize,@Param("cityId") int cityId);
    int getCount(@Param("cityId") Integer cityId);
}
