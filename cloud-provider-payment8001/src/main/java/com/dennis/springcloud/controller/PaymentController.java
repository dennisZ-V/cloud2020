package com.dennis.springcloud.controller;

import com.dennis.springcloud.base.AbstractBaseController;
import com.dennis.springcloud.entity.CommonResult;
import com.dennis.springcloud.entity.Payment;
import com.dennis.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author Dinnes Zhang
 * @date 2020-06-19
 */
@Slf4j
@RestController
@RequestMapping("payment")
public class PaymentController extends AbstractBaseController<Payment, PaymentService> {

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("create")
    public CommonResult create(@RequestBody Payment payment) {
        boolean result = this.service.save(payment);
        log.info("result : {}", result);

        if (result) {
            return new CommonResult(200, "insert success, serverPort : " + serverPort);
        } else {
            return new CommonResult(444, "insert failed, serverPort : " + serverPort);
        }
    }

    @GetMapping("findById/{id}")
    public CommonResult findById(@PathVariable Long id) {
        Payment payment = this.service.getById(id);
        log.info("payment : {}", payment);

        if (!ObjectUtils.isEmpty(payment)) {
            return new CommonResult(200, "query success, serverPort : " + serverPort, payment);
        } else {
            return new CommonResult(444, "query failed, ID : " + id + ", serverPort : " + serverPort, null);
        }
    }
}
