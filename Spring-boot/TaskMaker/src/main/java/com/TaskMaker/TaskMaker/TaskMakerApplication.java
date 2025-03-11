package com.TaskMaker.TaskMaker;

import com.TaskMaker.TaskMaker.DAO.Taskdao;
import com.TaskMaker.TaskMaker.Service.TaskService;
import com.TaskMaker.TaskMaker.Service.TaskServiceimpl;
import com.TaskMaker.TaskMaker.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@SpringBootApplication
public class TaskMakerApplication  {
//	@Autowired
//	TaskServiceimpl obj;
//	Random random;

	public static void main(String[] args) {
		SpringApplication.run(TaskMakerApplication.class, args);
	}

//	public void run(String...args){
//		obj.postTasks();
//	}

}
