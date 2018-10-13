package com.could.demo.boot.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author svili
 **/
@Configuration
@EnableFeignClients(basePackages = "com.cloud.demo.hello.api", basePackageClasses = FeignClient.class)
public class HelloServiceConfig {

}
