package com.cloud.demo.config.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigConsumerApplicationTests {

	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;

	@Test
	public void contextLoads() {
		System.out.println("---test start---");
		System.out.println(driverClassName);
		System.out.println("---test end---");
	}

}
