package com.rock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rock.properties.GrilProperties;

@RestController
@RequestMapping("/hello")
//@Controller
//@ResponseBody
public class HelloController {

//	@Value("${cpuSize}")
//	private String cupSize;
//	
//	@Value("${age}")
//	private Integer age;
//	@Value("${content}")
//	private String content;
//	

	
	@Autowired
	private GrilProperties grilProperties;
	
//	@RequestMapping(value= {"/hello","/hi"},method = RequestMethod.GET)
//	@RequestMapping(value= "/say/{id}",method = RequestMethod.GET)
	@GetMapping(value= "/say/{id}")
	public String say(@PathVariable("id") Integer id) {
//		return "Hello Spring Boot";
//		return content;
//		return grilProperties.getCpuSize();
//		return "index";//
		return " id =" + id;
	}
}
