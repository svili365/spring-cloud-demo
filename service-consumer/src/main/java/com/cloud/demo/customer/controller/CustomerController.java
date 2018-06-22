package com.cloud.demo.customer.controller;

import com.cloud.demo.customer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lishiwei
 **/
@RestController
public class CustomerController {

  @Autowired
  HelloService helloService;

  @RequestMapping(value = "/customer", method = RequestMethod.GET)
  public Object consumer() {
    return helloService.sayHello("abc");
  }

}
