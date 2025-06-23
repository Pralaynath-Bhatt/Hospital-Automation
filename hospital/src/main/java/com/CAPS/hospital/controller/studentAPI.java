package com.CAPS.hospital.controller;

import com.CAPS.hospital.entity.Student;
import com.CAPS.hospital.studentDAO.StudentDAO;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class studentAPI {
    StudentDAO studentDAO;
    @Autowired
    public studentAPI(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping("/student/{studentid}")
    public Student getstudent(@PathVariable int studentid){

        Student student=studentDAO.findById(studentid);
        return student;
    }
}
