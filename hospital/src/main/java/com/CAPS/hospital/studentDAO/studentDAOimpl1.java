package com.CAPS.hospital.studentDAO;

import com.CAPS.hospital.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
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

    @Override
    public Student findById(Integer id) {
       return entityManager.find(Student.class, id);
    }

    @Override
    public Student findPuri(String lname) {
        TypedQuery<Student> random=entityManager.createQuery("From Student where lastName=:data",Student.class);
        random.setParameter("data",lname);
        return random.getSingleResult();
    }
}
