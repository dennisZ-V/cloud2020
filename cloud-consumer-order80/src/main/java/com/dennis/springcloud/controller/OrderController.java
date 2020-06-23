package com.dennis.springcloud.controller;

import com.dennis.springcloud.entity.CommonResult;
import com.dennis.springcloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dinnes Zhang
 * @date 2020-06-19
 */
@RestController
@RequestMapping("consumer/payment")
public class OrderController {

    //    public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("findById/{id}")
    public CommonResult<Payment> findById(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/findById/" + id, CommonResult.class);
    }

    @GetMapping("zipkin")
    public String paymentZipkin(){
        String result = restTemplate.getForObject(PAYMENT_URL + "/payment/zipkin", String.class);
        return result;
    }
}
