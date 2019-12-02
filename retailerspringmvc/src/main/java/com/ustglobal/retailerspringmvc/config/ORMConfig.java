package com.ustglobal.retailerspringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configuration
public class ORMConfig {
	@Bean
	public LocalEntityManagerFactoryBean getBean() {  //we are using this class to create entitymanager factory
		   LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		   bean.setPersistenceUnitName("retailer-unit");
		   return bean;
	}

}
