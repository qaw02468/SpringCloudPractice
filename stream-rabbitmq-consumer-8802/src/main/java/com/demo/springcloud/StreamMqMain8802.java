package com.demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author - a89010531111@gmail.com
 */

@EnableEurekaClient
@SpringBootApplication
public class StreamMqMain8802 {

    public static void main(String[] args) {
        SpringApplication.run(StreamMqMain8802.class,args);
    }

}
