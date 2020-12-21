package com.demo.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author - a89010531111@gmail.com
 */

@Configuration
public class MyRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
