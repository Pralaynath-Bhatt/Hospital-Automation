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
		//createStudent(theStudentDAO);
		//	readStudent(theStudentDAO);
			readStudentPuri(theStudentDAO);
		};
	}

	private void readStudentPuri(StudentDAO theStudentDAO) {
		System.out.println("reading the data of id 1");
		Student puri=theStudentDAO.findPuri("singh");
		System.out.println(puri.toString());
	}

	private void readStudent(StudentDAO theStudentDAO) {
		System.out.println("reading the data of id 1");
		Student one=theStudentDAO.findById(3);
		System.out.println("Student found");
		System.out.println(one.getEmail());
		System.out.println(one.toString());
	}

//	private void createStudent(StudentDAO theStudentDAO) {
//		System.out.println("Creating a new student");
//		Student om=new Student("hariom","Mishra","hariom@gmail.com");
//		System.out.println("saving the student");
//		theStudentDAO.Save(om);
//		System.out.println("Student saved");
//	}
}
