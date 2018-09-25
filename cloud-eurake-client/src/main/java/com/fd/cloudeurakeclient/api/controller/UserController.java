package com.fd.cloudeurakeclient.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/test/{id}")
    public String test(@PathVariable Long id){
        //通过restTemplate调用服务
        return "我是一个eureka提供者"+id;
    }

}
