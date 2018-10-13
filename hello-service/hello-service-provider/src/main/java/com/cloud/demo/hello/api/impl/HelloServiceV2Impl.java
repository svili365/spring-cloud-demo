package com.cloud.demo.hello.api.impl;

import com.cloud.demo.hello.api.HelloServiceV2;
import com.cloud.demo.hello.common.JsonResponse;
import com.cloud.demo.hello.common.JsonResponseFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author svili
 **/
@RestController
public class HelloServiceV2Impl implements HelloServiceV2{

  @Override
  public JsonResponse<String> sayHello(@PathVariable String name) {
    if ("error".equals(name)) {
      return JsonResponseFactory.error(1, "name is error.");
    }
    return JsonResponseFactory.success("hello , " + name);
  }

}
