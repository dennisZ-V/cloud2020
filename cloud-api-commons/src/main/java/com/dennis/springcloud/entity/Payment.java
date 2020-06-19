package com.dennis.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dinnes Zhang
 * @date 2020-06-19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {


    private Long id;
    private String serial;
}
