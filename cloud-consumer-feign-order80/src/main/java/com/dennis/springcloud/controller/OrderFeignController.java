package com.dennis.springcloud.controller;

import com.dennis.springcloud.entity.CommonResult;
import com.dennis.springcloud.entity.Payment;
import com.dennis.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dinnes Zhang
 * @date 2020-06-22
 */
@Slf4j
@RestController
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/findById/{id}")
    public CommonResult<Payment> findById(@PathVariable Long id){
        return paymentFeignService.findById(id);
    }

    @GetMapping("/consumer/feign/timeout")
    String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }
}
