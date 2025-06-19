package com.CAPS.hospital.controller;

import com.CAPS.hospital.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class studentAPI {
    @GetMapping("/student")
    public List<Student> getStudentsAPI(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Om","Puri","om@gmail.com"));
        students.add(new Student("Ram","Puri","om@gmail.com"));
        students.add(new Student("Naresh","Puri","om@gmail.com"));
        students.add(new Student("Shreya","Puri","om@gmail.com"));
        return students;
    }
}
