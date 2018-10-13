package com.could.demo.boot.component;

import com.cloud.demo.hello.api.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author svili
 **/
@FeignClient(value = "hello-service-provider", fallback = HelloServiceCallback.class)
public interface HelloServiceClient extends HelloService {

}
