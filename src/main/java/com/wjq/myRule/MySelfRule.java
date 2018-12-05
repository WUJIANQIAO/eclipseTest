package com.wjq.myRule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {

		System.out.println("我 的地胖我做主，加油");

		System.out.println("我 的什么情况啊主，加油吧，老铁");
		System.out.println("我 的地胖我做主，加油吧，老铁");
//>>>>>>> branch 'master' of https://github.com/WUJIANQIAO/eclipseTest.git
		//return new RandomRule();//ribbon默认是轮询，这里自定义为随机
		return new RandomRule_WJQ();
	}
	
}
