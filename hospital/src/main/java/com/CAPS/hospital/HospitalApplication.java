package com.CAPS.hospital;

import com.CAPS.hospital.entity.Student;
import com.CAPS.hospital.studentDAO.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO theStudentDAO){
		return runner ->{
		createStudent(theStudentDAO);
		};
	}

	private void createStudent(StudentDAO theStudentDAO) {
		System.out.println("Creating a new student");
		Student om=new Student("Om","Puri","ompuri@gmail.com");
		System.out.println("saving the student");
		theStudentDAO.Save(om);
		System.out.println("Student saved");
	}
}
