package com.code4u.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
