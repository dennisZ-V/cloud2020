package com.dennis.springcloud.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Dinnes Zhang
 * @date 2020-06-19
 */
@Data
public class BaseEntity implements Serializable {

    @TableId(type = IdType.AUTO)
    protected Long id;
}
