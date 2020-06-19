package com.dennis.springcloud.mapper;

import com.dennis.springcloud.base.DefaultBaseMapper;
import com.dennis.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper extends DefaultBaseMapper<Payment> {

}
