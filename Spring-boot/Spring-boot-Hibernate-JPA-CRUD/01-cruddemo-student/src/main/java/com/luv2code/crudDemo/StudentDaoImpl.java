package com.luv2code.crudDemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//The @Repository annotation in Spring is used to indicate that
// a class is responsible for database operations (DAO layer).

@Repository
public class StudentDaoImpl implements StudentDAO {

    //Entity manager object
    private EntityManager entityManager;


    //Constructor injection of the same
    @Autowired
    // @Autowired automatically creates Entity manager object no need to first create an object
    // using new and then pass into an object of StudentDOAImpl class.
    public StudentDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    //implement save method
    @Override
    @Transactional
    //@Transactional eliminates the use of beginTransaction, tx.commit like in hibernate.
    public void save(Student student){
        entityManager.persist(student);
    }

    @Override
    public Student getStudentById(int Id){
        return entityManager.find(Student.class, Id);
    }

    @Override
    public List<Student> findAll(){

        //Create Query
        TypedQuery<Student> theQuery= entityManager.createQuery("From Student order by lastName desc", Student.class);

        //Return Query Results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName){

        //create Query
        TypedQuery<Student> theQuery= entityManager.createQuery("From Student where lastName = :theData", Student.class);

        //set query parameters
        theQuery.setParameter("theData", lastName );

        //returnquery results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent){
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(int id) {
       Student myStudent= entityManager.find(Student.class,id);
        entityManager.remove(myStudent);

    }
}
