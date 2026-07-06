package com.code4u.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	//it is executed after all beans have bean loaded
	@Bean
	public CommandLineRunner commandLineRunner()
	{

		//return Runner interface implementation
		return runner-> {
			System.out.println("hello world!");
		};
	}
}
