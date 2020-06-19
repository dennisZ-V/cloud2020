package com.dennis.springcloud.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @author Dinnes Zhang
 * @date 2020-06-19
 */
public abstract class AbstractBaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {
}
