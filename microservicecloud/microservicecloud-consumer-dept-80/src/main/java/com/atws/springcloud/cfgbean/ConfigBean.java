package com.atws.springcloud.cfgbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	
	//相当于在spring的配置文件中添加类
	@Bean
	public RestTemplate getRestTemplate(){
		
		return new RestTemplate();
	}
	
}
