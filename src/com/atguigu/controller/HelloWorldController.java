package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(){
		
		System.out.println("开始复习springMVC,这是复习的第一个例子");
		
		return "hello";
	}

}
