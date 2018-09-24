package com.fd.cloudeurakecustomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getUser/{id}")
    public String getUser(@PathVariable Long id){
        //通过restTemplate调用服务
        //这里可以通过直接写ip地址访问，这样就变成直连，不会走注册中心
        //如果通过serviceid访问就会走注册中心
        return restTemplate.getForObject("http://eureka-provide/user/test/"+id,String.class);

    }
}
