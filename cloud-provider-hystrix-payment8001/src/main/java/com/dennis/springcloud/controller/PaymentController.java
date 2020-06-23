package com.dennis.springcloud.controller;

import com.dennis.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dinnes Zhang
 * @date 2020-06-22
 */
@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("result:{}",result);
        return result;
    }

    @GetMapping("hystrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable Integer id){
        String result = paymentService.paymentInfo_Timeout(id);
        log.info("result:{}",result);
        return result;
    }
}
