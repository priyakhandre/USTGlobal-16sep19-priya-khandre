package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Pet;

public class PetConfigurationClass {
	@Bean(name = "dog")
	public Dog getDog() {
		return new Dog();
	}
	
	
	@Bean(name="cat")
	public Cat getCat() {
		return new Cat();
	}
	
	
	@Bean(name="pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Bittu");
		// pet.setAnimal(getDog()); //wiring to dog
		return pet;
		
		
	}

}
