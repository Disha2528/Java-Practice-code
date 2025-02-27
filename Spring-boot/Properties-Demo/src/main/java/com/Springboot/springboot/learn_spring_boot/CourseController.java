package com.Springboot.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CourseController {

    @RequestMapping("/Course")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "AWS", "Alice"),
                new Course(1, "DevOps", "Bob"),
                new Course(1, "SQL", "Lea")
        );
    }

    @RequestMapping("/Hello")
    public String sayHello(){
        return "Hello!";
    }

//    @RequestMapping("/Hello1")
//    public String SayHello(){
//        return "Hello Dish!";
//    }

    @RequestMapping("/Workout")
    public String workout(){
        return "run a hard 5k";
    }

    @RequestMapping("/Workout1")
    public String workout1(){
        return "run a hard 3k";
    }

    @RequestMapping("/Workout2")
    public String workout2(){
        return "run a hard 2k";
    }
}
