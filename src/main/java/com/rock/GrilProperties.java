package com.rock;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/***
 * 
 * @author root
 * date: Aug 21, 2018 10:37:53 PM.<br/>
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GrilProperties {

	
	
	private String cpuSize;
	private Integer age;
	public String getCpuSize() {
		return cpuSize;
	}
	public void setCpuSize(String cpuSize) {
		this.cpuSize = cpuSize;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
}
