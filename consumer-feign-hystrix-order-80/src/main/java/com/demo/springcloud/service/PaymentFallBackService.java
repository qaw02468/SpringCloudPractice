package com.demo.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author - a89010531111@gmail.com
 */

@Component
public class PaymentFallBackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallBackService ok";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallBackService timeOut";
    }
}
