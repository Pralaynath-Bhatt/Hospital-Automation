package com.CAPS.hospital.studentDAO;

import com.CAPS.hospital.entity.Student;
import org.springframework.stereotype.Repository;

public interface StudentDAO {
    public void Save(Student theStudent);
    public Student findById(Integer id);

    Student findPuri(String lname);
}
