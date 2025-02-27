package com.luv2code.crudDemo;

import jakarta.transaction.Transactional;

import java.util.List;

public interface StudentDAO {

    public void save(Student student);
    public Student getStudentById(int Id);

    public List<Student> findAll();
    public List<Student> findByLastName(String lastName);
    @Transactional
    public void update(Student student);

    public void delete(int id

    );
}
