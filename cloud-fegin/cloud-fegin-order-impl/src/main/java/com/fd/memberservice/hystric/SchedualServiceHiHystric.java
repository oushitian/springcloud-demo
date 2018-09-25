package com.fd.memberservice.hystric;

import com.fd.memberservice.service.MemberService;
import org.springframework.stereotype.Component;

/**
 * @Author xyl
 * @Create 2018-09-25 13:37
 * @Desc fegin客户端实现熔断器，必要实现fegin的接口，并且指定当前的实现类
 **/
@Component
public class SchedualServiceHiHystric implements MemberService {
    @Override
    public String getMember() {
        return "当前服务不可用";
    }
}
