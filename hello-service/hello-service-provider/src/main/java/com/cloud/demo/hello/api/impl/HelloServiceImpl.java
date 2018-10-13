package com.cloud.demo.hello.api.impl;

import com.cloud.demo.hello.api.HelloService;
import com.cloud.demo.hello.common.JsonResponse;
import com.cloud.demo.hello.common.JsonResponseFactory;
import com.cloud.demo.hello.exception.IncServiceException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lishiwei
 **/
@RestController
public class HelloServiceImpl implements HelloService {

  @Override
  public String sayHello(String name) {
    if ("error".equals(name)) {
      throw new IncServiceException(1, "name is error.");
    }
    return "hello , " + name;
  }

}
