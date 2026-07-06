package com.code4u.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;
import java.util.List;

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
			//save a student in table
			//saveStudent(studentDAO);

			//find a student with given id
			//System.out.println(readStudent(1,studentDAO));


            //read all students
			//readAll(studentDAO);

			//read all ordered by last name
			//readAllOrderByLastName(studentDAO);

			//read a student having given last name;
			//findByLName("vishaka",studentDAO);

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
	public void readAll(StudentDAO studentDAO)
	{
		List<Student> studentList=studentDAO.findAll();
		for(Student s:studentList)
		{
			System.out.println(s.toString());
		}
	}
	public void readAllOrderByLastName(StudentDAO studentDAO)
	{
		List<Student> studentList=studentDAO.orderByLastName();
		for(Student s:studentList)
		{
			System.out.println(s.toString());
		}
	}
	public void findByLName(String name,StudentDAO studentDAO)
	{
		Student s=studentDAO.findByLastName(name);
		if(s!=null)
			System.out.println(s.toString());
		else System.out.println("no one exists with last name "+name);
	}

}
