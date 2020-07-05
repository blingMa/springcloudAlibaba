package com.cloud.demoservice2.demo.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shihao.ma
 * @since 2020/6/9
 */
@RestController
@RequiredArgsConstructor
public class DemoApi {

    private final RestTemplate restTemplate;

    @GetMapping("/demo2")
    public String getString() {
        return "hello demo-service2";
    }

    //使用RestTemplate结合ribbon调用nacos中注册的服务
    @GetMapping("/hello")
    public String getHello() {
        return restTemplate.getForObject("http://demo-service1/demo1", String.class);
    }

}
