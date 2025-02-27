package com.springrest.springrest.Controller;

import com.springrest.springrest.Service.CourseService;
import com.springrest.springrest.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    private CourseService courseservice;

    @GetMapping("/home")
    public String home(){
        return "This is home";
    }

    //get the courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseservice.getCourses();

    }

    //get course by id
    @GetMapping("/courses/{courseId}")
    public Optional<Course> getCourseById(@PathVariable String courseId){
        return this.courseservice.getCourseById(Long.parseLong(courseId));
    }

    //add a new Course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
         return this.courseservice.addCourse(course);
    }

    //update a course
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseservice.updateCourse(course);
    }

    //delete the course
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)


        {
            try{
                courseservice.deleteCourse(Long.parseLong(courseId));
                return new ResponseEntity<>(HttpStatus.OK);
            }catch(Exception e){
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }





}
