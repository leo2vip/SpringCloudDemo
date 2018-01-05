package com.example.SpringCloudDemo.controller;

import com.example.SpringCloudDemo.entity.Book;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qutf on 2018/1/3.
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

//    @Value("${book.name}")
//    private String name;

    @RequestMapping("/hello")
    public String hello(){
//        System.out.println("book:"+name);
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello ,host:"+instance.getHost()+",service_id:"+instance.getServiceId());
        return "Hello world!";
    }
}
