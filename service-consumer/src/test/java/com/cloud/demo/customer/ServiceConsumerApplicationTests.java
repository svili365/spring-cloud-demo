package com.cloud.demo.customer;

import com.alibaba.fastjson.JSON;
import com.cloud.demo.customer.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceConsumerApplicationTests {

	@Autowired
	private HelloService helloService;

	@Test
	public void contextLoads() {

		Object obj = helloService.sayHello("abc");
		System.out.println(JSON.toJSONString(obj));
	}

}
