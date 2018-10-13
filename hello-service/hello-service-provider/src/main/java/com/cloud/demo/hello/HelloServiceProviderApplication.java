package com.cloud.demo.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lishiwei
 **/
@EnableEurekaClient
@SpringBootApplication
public class HelloServiceProviderApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloServiceProviderApplication.class, args);
  }

}
