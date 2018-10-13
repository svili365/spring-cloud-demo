package com.could.demo.boot.component;

import com.cloud.demo.hello.api.HelloServiceV2;
import com.cloud.demo.hello.common.JsonResponse;
import com.cloud.demo.hello.common.JsonResponseFactory;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author svili
 **/
@Component
public class HelloServiceV2Component {

  private Logger logger = LoggerFactory.getLogger(HelloServiceV2Component.class);

  @Autowired
  private HelloServiceV2 helloServiceV2;

  @HystrixCommand(fallbackMethod = "sayHelloFallback")
  public JsonResponse<String> sayHello(String name) {
    return helloServiceV2.sayHello(name);
  }

  /**
   * fallback函数的形参列表和返回值类型与原函数保持一致
   */
  private JsonResponse<String> sayHelloFallback(String name) {
    logger.warn("execute fallback sayHello() ,name is : {}", name);
    return JsonResponseFactory.error(404,"service is not get.");
  }

}
