package com.fd.memberservice.controller;

import com.fd.memberservice.feginclient.MemberFeginClient;
import com.fd.memberservice.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xyl
 * @Create 2018-09-25 9:18
 * @Desc 订单服务调用会员服务的控制器
 **/
@RestController
public class OrderController {

    //注入的是fegin的接口，代替restTemplate和ribbon
    @Autowired
    private MemberFeginClient memberFeginClient;

    @RequestMapping("getMemberTest")
    public String getMemberTest(){
        return memberFeginClient.getMember();
    }

}
