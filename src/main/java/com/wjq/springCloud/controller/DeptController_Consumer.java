package com.wjq.springCloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wjq.springCloud.entities.Dept;


@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {

	/**
	 * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
	 * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
	 */
	@Autowired
	private RestTemplate restTemplate;

	private static final String REST_URL_PREFIX="http://SERVICECLOUD-DEPT/dept";
	
	@RequestMapping(value="/add")
	public boolean addDept(Dept dept) {
		
		return restTemplate.postForObject(REST_URL_PREFIX+"/add", dept, Boolean.class);
	}
	
	
	@RequestMapping(value="/findById/{id}")
	public Dept findById(@PathVariable("id") Long id) {
		//return restTemplate.getForObject(REST_URL_PREFIX+"/findById/{id}", Dept.class, id);
		return restTemplate.getForObject(REST_URL_PREFIX+"/findById/"+id, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/findAll")
	public List<Dept> findAll(){
		return restTemplate.getForObject(REST_URL_PREFIX+"/findAll", List.class);
	}
	
	@RequestMapping(value="/discovery")
	public Object discovery() {
		
		return restTemplate.getForObject(REST_URL_PREFIX+"/discovery", Object.class);
		
	}
}
