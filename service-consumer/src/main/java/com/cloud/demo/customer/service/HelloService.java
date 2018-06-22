package com.cloud.demo.customer.service;

import com.cloud.demo.customer.common.JsonResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lishiwei
 **/
@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    JsonResponse sayHello(@RequestParam("name") String name);
}
