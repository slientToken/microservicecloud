package com.atguigu.springcloud.cfgbeans;

import javax.xml.ws.WebEndpoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration // bean = applicatonContext.xml
public class ConfigBean
{
	@Bean // <bean name="" class="">
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}


