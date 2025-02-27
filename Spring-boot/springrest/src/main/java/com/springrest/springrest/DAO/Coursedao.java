package com.springrest.springrest.DAO;

import com.springrest.springrest.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Coursedao extends JpaRepository<Course,Long> {


}
