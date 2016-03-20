package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/crm")
public class SecondXML {
	
	
	@RequestMapping(value="/testTwo",method=RequestMethod.GET)
	public String second(){
		
		System.out.println("第二种springMVC配置方式");
		return "ok";
	}

}
