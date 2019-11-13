package com.itrip.biz.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.HotelService;
import com.itrip.utils.DtoUtil;
import com.itrip.utils.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class HotelController {
    @Resource
    HotelService hService;

    /**
     * 获取分页的酒店信息
     * @return
     */
    @RequestMapping("/hotel/queryHotelsByCityId")
    public Dto getPagedHotels(
            @RequestParam(value = "currentCount",defaultValue = "1") int currentCount,
            @RequestParam("cityId") int cityId
                              ){
        int pageSize=5;
        Page<Hotel> pagedHotels = hService.getPagedHotelByCityId(currentCount, pageSize, cityId);
        if(pagedHotels.getList().size()>0){
            return DtoUtil.returnSuccess(pagedHotels,"found data of hotel");
        }else{
            return DtoUtil.returnFail("not data found");
        }
    }
}
