package com.cloud.demo.config.consumer.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lishiwei
 **/
@RestController
public class ConfigCustomerController {

  @Value("${spring.datasource.driver-class-name}")
  private String driverClassName;

  @GetMapping("/test")
  public Map<String,Object> test(){
    Map<String,Object> map = new HashMap<>();
    map.put("driver-class-name",driverClassName);
    return map;
  }

}
