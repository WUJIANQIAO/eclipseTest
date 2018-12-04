package com.wjq.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.wjq.myRule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
//设置自己ribbon的对特定微服务的自定义算法  (注意该注解对应的configuration的类必须不能在该主启动类同级或下级的包内)
@RibbonClient(name="SERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class SpringCloudDept_Consumer_80_APP {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDept_Consumer_80_APP.class, args);
		
	}
}
