package com.demo.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author - a89010531111@gmail.com
 */


@Data
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
