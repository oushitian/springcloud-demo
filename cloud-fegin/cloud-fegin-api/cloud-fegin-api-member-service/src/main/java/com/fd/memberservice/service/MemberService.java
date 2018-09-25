package com.fd.memberservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xyl
 * @Create 2018-09-25 9:11
 * @Desc 写点注释吧
 **/
@FeignClient(value = "service-feign-member")
public interface MemberService {

    @RequestMapping("/getMember")
    public String getMember();

}
