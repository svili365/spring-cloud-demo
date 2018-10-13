package com.could.demo.boot.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author svili
 **/
@Component
@RequestMapping(value = "helloService/v1/fallback")
public class HelloServiceCallback implements HelloServiceClient {

  @Override
  public String sayHello(String name) {
    return null;
  }
}
