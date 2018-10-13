package com.v56.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * mq @EnableTurbineStream
 * @author lishiwei
 **/
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
@EnableEurekaClient
public class TurbineServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(TurbineServerApplication.class, args);
  }
}
