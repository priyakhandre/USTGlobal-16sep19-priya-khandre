package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ustglobal.springcore.di.Hello;
@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {
	
	@Bean(name="hello")
	/*@Scope("prototype")*/
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("i Love python");
		return hello;
	}
	
}
