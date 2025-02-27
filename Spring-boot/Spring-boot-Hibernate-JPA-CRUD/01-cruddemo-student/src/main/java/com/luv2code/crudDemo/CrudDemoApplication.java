package com.luv2code.crudDemo;

import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner-> //
		// queryForlastName(studentDAO);
		//updatestudent(studentDAO);
				deleteStudent(studentDAO);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int id=5;
		studentDAO.delete(id);

	}

	private void CreateStudent(StudentDAO studentDOA){

		//create the student object
		System.out.println("Creating new Object");
		Student tempStudent = new Student( "Swati", "Gamit", "disha@gmail.com");
		studentDOA.save(tempStudent);
	}

	private void getStudent(StudentDAO studentDAO){

		//creating and object
		Student s= new Student("Alex","xu","Alex@gmail.com");
		//saving the object
		studentDAO.save(s);

		//display id of the saved student
		int theId= s.getId();
		System.out.println("Saved Student : generated id: " + theId);

		//retrieve student based on the id: primary key
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent= studentDAO.getStudentById(theId);

		//display student
		System.out.println(myStudent);



	}

	private void queryForStudents(StudentDAO studentDAO){

		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		//display list of students
		for(Student tempStudent: theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForlastName(StudentDAO studentDAO){


		//get List of students
		List<Student> theStudents = studentDAO.findByLastName("Paul");

		//display Student
		for(Student student: theStudents){
			System.out.println(student);

		}
	}

	public void updatestudent(StudentDAO studentDAO){

		//get Student based on id, i.e. primary key
		int Id=1;
		Student myStudent= studentDAO.getStudentById(Id);

		//changing firstname
		myStudent.setFirstName("Richa");

		//update

		studentDAO.update(myStudent);

		//display updated student
		System.out.println("Updated student "+ myStudent);

//		//update
//		studentDAO.update("Johnson", "Alice");
//
//		//display
//		List<Student> myStudent= studentDAO.findByLastName("Johnson");
//
//		for(Student student :myStudent){
//			System.out.println(student);
//		}



	}



}
