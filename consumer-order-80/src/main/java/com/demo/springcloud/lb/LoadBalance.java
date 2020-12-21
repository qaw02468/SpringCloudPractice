package com.demo.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author - a89010531111@gmail.com
 */
public interface LoadBalance {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
