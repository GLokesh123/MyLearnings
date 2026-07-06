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
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
	{

		//return Runner interface implementation
		return runner-> {
			//System.out.println(find(saveStudent(studentDAO),studentDAO));
			System.out.println(readStudent(2,studentDAO));
		};
	}
	public int saveStudent(StudentDAO studentDAO)
	{
		Student student=new Student("bali","indo","bali@gmail.com");
		System.out.println("student entity object is created");
		studentDAO.save(student);
		System.out.println("student data is saved in DB");

		System.out.println("Saved Student Id is "+student.getId());

		return student.getId();


	}
	public String readStudent(int id,StudentDAO studentDAO)
	{
		return studentDAO.findById(id);
	}
}
