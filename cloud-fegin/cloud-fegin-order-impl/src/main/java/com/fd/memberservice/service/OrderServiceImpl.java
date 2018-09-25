package com.fd.memberservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xyl
 * @Create 2018-09-25 9:11
 * @Desc 写点注释吧
 **/
@Service
public class OrderServiceImpl implements OrderService{

    @RequestMapping("/getOrder")
    public String getOrder(){
        return "调用订单服务！";
    }

}
