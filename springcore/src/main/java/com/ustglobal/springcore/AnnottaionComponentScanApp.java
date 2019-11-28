package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ustglobal.springcore.config.ComponentScanConfiguration;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnottaionComponentScanApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (ComponentScanConfiguration.class);
		Hello hello=context.getBean(Hello.class);
		hello.setMsg("i love python");
		System.out.println(hello.getMsg());
		
		Pet pet =context.getBean(Pet.class);
		pet.setName("google");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}

}
