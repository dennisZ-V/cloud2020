package com.dennis.springcloud.service.impl;

import com.dennis.springcloud.base.AbstractBaseServiceImpl;
import com.dennis.springcloud.entity.Payment;
import com.dennis.springcloud.mapper.PaymentMapper;
import com.dennis.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author Dinnes Zhang
 * @date 2020-06-19
 */
@Service
public class PaymentServiceImpl extends AbstractBaseServiceImpl<PaymentMapper,Payment> implements PaymentService {
}
