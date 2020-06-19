package com.dennis.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dinnes Zhang
 * @date 2020-06-19
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced//使用@LoadBalanced开启RestTemplate负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
