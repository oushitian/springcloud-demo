package com.fd.memberservice.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xyl
 * @Create 2018-09-25 9:11
 * @Desc 服务中没有控制层的概念，所以直接提供service
 **/
@RestController
public class MemberServiceImpl implements MemberService{

    @RequestMapping("/getMember")
    public String getMember(){
        return "调用会员服务！";
    }

}
