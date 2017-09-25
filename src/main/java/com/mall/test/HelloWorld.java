package com.mall.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mall.facade.service.HelloKittyService;

@RestController
public class HelloWorld {
	@Autowired
	private HelloKittyService helloKittyService;
	
	@RequestMapping("/say")
	public String getSay(){
		return "hello boot"+"=="+helloKittyService.getKittyName();
	}
	
}
