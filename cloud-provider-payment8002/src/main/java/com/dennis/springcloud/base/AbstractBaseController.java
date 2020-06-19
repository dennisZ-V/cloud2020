package com.dennis.springcloud.base;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Dinnes Zhang
 * @date 2020-06-19
 */
public abstract class AbstractBaseController<T,S extends DefaultBaseService<T>> {

    protected S service;

    @Autowired(required = false)
    public void setService(S service) {
        this.service = service;
    }
}
