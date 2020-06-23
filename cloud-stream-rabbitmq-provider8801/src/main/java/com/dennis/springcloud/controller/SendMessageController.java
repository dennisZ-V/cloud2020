package com.dennis.springcloud.controller;

import com.dennis.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dinnes Zhang
 * @date 2020-06-22
 */
@RestController
public class SendMessageController {

    @Autowired
    private IMessageProvider iMessageProvider;

    @GetMapping("sendMessage")
    public String sendMessage(){
        return iMessageProvider.send();
    }
}
