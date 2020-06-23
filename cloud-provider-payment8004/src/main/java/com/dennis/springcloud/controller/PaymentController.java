package com.dennis.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Dinnes Zhang
 * @date 2020-06-22
 */
@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("payment/zk")
    public String paymentzk() {
        return "spring cloud with zookeeper : " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
