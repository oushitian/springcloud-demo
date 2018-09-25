package com.fd.cloudeurakecustomer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
@EnableHystrix//熔断器的注解(配置在消费方的调用服务者)
public class UserController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getUser/{id}")
    @HystrixCommand(fallbackMethod = "testError")  //声明这是个熔断的服务调用，当该服务不可用时，会触发testError的方法
    public String getUser(@PathVariable Long id){
        //通过restTemplate调用服务
        //这里可以通过直接写ip地址访问，这样就变成直连，不会走注册中心
        //如果通过serviceid访问就会走注册中心
        return restTemplate.getForObject("http://eureka-provide/user/test/"+id,String.class);

    }

    public String testError(@PathVariable Long id){//回调的方法一定要跟原方法保持相同的参数
        return "服务调用失败"+id;
    }
}
