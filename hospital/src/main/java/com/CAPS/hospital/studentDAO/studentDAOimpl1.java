package com.CAPS.hospital.studentDAO;

import com.CAPS.hospital.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class studentDAOimpl1 implements StudentDAO{

    public EntityManager entityManager;
    @Autowired
    public studentDAOimpl1(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void Save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}
