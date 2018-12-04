package com.wjq.myRule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {
		
		//return new RandomRule();//ribbon默认是轮询，这里自定义为随机
		return new RandomRule_WJQ();
	}
	
}
