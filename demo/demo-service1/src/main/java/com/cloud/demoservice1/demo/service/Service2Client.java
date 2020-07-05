package com.cloud.demoservice1.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shihao.ma
 * @since 2020/6/10
 */
@FeignClient("demo-service2")
public interface Service2Client {

    @GetMapping("/demo2")
    String getHello();
}
