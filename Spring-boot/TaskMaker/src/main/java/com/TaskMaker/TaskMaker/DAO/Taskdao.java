package com.TaskMaker.TaskMaker.DAO;

import com.TaskMaker.TaskMaker.entity.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Taskdao extends JpaRepository<Task,Integer> {

    List<Task> findAll(Sort sort);
    Page<Task> findAll(Pageable pageable);

}
