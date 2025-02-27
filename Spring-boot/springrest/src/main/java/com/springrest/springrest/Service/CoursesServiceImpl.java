package com.springrest.springrest.Service;

import com.springrest.springrest.DAO.Coursedao;
import com.springrest.springrest.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CoursesServiceImpl implements CourseService{

    @Autowired
    private Coursedao coursedao;

//    List<Course> list=new ArrayList<>();

    public CoursesServiceImpl() {
//        list.add(new Course(145, "Java", "This is Core Java"));
//        list.add(new Course(123,"SpringBoot", "This is Sprinboot Course"));
    }

    @Override
    public List<Course> getCourses() {
//        return list;
        return coursedao.findAll();
    }

    @Override
    public Optional<Course> getCourseById(long id) {
//        Course c=null;
//        for(Course course:list){
//            if(course.getId()==id){
//                c=course;
//                break;
//            }
//        }
//        return c;
        return coursedao.findById(id);
    }
    @Override
    public Course addCourse(Course course) {
//        if (course == null || course.getId() <= 0 || course.getTitle() == null || course.getTitle().isEmpty() ||
//                course.getDescription() == null || course.getDescription().isEmpty()) {
//            throw new IllegalArgumentException("Invalid course data. Please provide a valid course.");
//        }
//
//        list.add(course);
//        System.out.println("Course added successfully: " + course);
//        return course;
        return coursedao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
//        Course c=null;
//        for(Course co:list){
//            if(co.getId()==course.getId()){
//                co.setTitle(course.getTitle());
//                co.setDescription(course.getDescription());
//                c=co;
//                break;
//            }
//        }
//
//        return c;
        return coursedao.save(course);
    }

    @Override
    public void deleteCourse(long parselong){
        Course entity=coursedao.getOne(parselong);
        coursedao.delete(entity);
    }

//    @Override
//    public String toString(){
//
//    }


}
