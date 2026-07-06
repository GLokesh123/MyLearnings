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
	public CommandLineRunner commandLineRunner(StudentDAO studentDao)
	{

		//return Runner interface implementation
		return runner-> {
			saveData(studentDao);
		};
	}
	public void saveData(StudentDAO studentDAO)
	{
		Student student=new Student("loki","gubbala","loki@gmail.com");
		System.out.println("student entity object is created");
		studentDAO.save(student);
		System.out.println("student data is saved in DB");

		System.out.println("Saved Student Id is "+student.getId());

	}
}
