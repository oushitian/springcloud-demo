package com.fd.memberservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author xyl
 * @Create 2018-09-25 9:09
 * @Desc 写点注释吧
 **/
@SpringBootApplication
@EnableEurekaClient
public class MemberServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberServiceApplication.class,args);
    }
}
