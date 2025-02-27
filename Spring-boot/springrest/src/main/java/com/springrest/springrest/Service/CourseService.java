package com.springrest.springrest.Service;

import com.springrest.springrest.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    public List<Course> getCourses();

    public Optional<Course> getCourseById(long id);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long parselong);
}
