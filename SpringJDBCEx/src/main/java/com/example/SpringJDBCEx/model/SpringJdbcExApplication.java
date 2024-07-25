package com.example.SpringJDBCEx.model;

import com.example.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.example.SpringJDBCEx")
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcExApplication.class, args);

		Student stu = context.getBean(Student.class);
		stu.setRollNo(101);
		stu.setName("Name");
		stu.setMarks(90);


		// Create a bean for student service
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(stu);

		// fetch the data i want to list the all data
		List<Student> students = StudentService.getStudents();
		System.out.println(students);
	}

}
