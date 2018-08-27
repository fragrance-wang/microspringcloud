package com.atws.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.atws.springcloud.entities.Dept;
import com.atws.springcloud.service.impl.DeptServiceImpl;


@SpringBootApplication
@ComponentScan(basePackages="com.atws.springcloud")
public class ResourceTest {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ResourceTest.class, args);
		
		DeptServiceImpl bean = run.getBean(DeptServiceImpl.class);
		
		Dept dept = bean.get(1L);
		System.err.println(dept);
		
	}
}
