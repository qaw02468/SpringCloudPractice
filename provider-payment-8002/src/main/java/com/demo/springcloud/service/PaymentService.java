package com.demo.springcloud.service;

import com.demo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author - a89010531111@gmail.com
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
