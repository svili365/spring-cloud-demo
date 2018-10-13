package com.cloud.demo.hello.api;

import com.cloud.demo.hello.common.JsonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author svili
 **/
@FeignClient(value = "hello-service-provider")
@RequestMapping(value = "/helloService/v2")
public interface HelloServiceV2 {

  @PostMapping(value = "/sayHello/{name}")
  JsonResponse<String> sayHello(@PathVariable(value = "name") String name);
}
