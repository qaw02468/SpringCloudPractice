package com.demo.springcloud.serivce;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import java.util.UUID;

/**
 * @author - a89010531111@gmail.com
 */

@EnableBinding(Source.class)
public class IMessageProviderImpl implements IMessageProvider {

    private final MessageChannel output;

    public IMessageProviderImpl(MessageChannel output) {
        this.output = output;
    }

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("****************serial:" + serial);
        return serial;
    }
}