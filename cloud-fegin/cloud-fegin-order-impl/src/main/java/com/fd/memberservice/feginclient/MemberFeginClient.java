package com.fd.memberservice.feginclient;

import com.fd.memberservice.hystric.SchedualServiceHiHystric;
import com.fd.memberservice.service.MemberService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author xyl
 * @Create 2018-09-25 19:26
 * @Desc feignClient一定要写到调用客户端，为了做熔断或者降级
 **/
@FeignClient(value = "service-feign-member", fallback = SchedualServiceHiHystric.class)
public interface MemberFeginClient extends MemberService {
}
