package com.cloud.demo.service.controller;

import com.cloud.demo.service.common.JsonResponse;
import com.cloud.demo.service.common.JsonResponseFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lishiwei
 **/
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public JsonResponse sayHello(@RequestParam String name) {

        return JsonResponseFactory.success("hello," + name);
    }
}
