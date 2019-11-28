package com.ustglobal.springcore.di;

import java.util.Map;

import org.springframework.stereotype.Component;


@Component("hello")
public class Hello {
	private String msg;
	private Map<String ,Integer> map;
	
	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public Hello() {
		System.out.println("Hello object created");
		
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	public void init() {
		System.out.println("Init method executing from hello");
	}
	
	public void destroy() {
		System.out.println("estroy method executig from hello");
	}
	

}
