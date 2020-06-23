package com.dennis.springcloud.service;

import com.dennis.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("payment/findById/{id}")
    CommonResult findById(@PathVariable("id") Long id);

    @GetMapping("payment/feign/timeout")
    String paymentFeignTimeout();
}
