package com.cloud.demo.hello.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lishiwei
 **/
@RequestMapping(value = "/helloService/v1")
public interface HelloService {

  @GetMapping(value = "/sayHello")
  String sayHello(@RequestParam(value = "name") String name);

}
