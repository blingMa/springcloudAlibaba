package com.cloud.demoservice1.demo.api;

import com.cloud.demoservice1.demo.service.Service2Client;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shihao.ma
 * @since 2020/6/9
 */
@RestController
@RequiredArgsConstructor
public class DemoApi {

    private final Service2Client service2Client;

    @GetMapping("/demo1")
    public String getString() {
        return "hello demo-service1";
    }

    //使用openfeign调用nacos中注册的服务
    @GetMapping("/hello")
    public String hello() {
        return service2Client.getHello();
    }
}
