package com.TaskMaker.TaskMaker.Controller;

import com.TaskMaker.TaskMaker.Service.TaskService;
import com.TaskMaker.TaskMaker.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    private TaskService taskService;

//    @GetMapping("/tasks")
//    public List<Task> getTasks(){
//        System.out.println("All Tasks");
//        return (List<Task>) taskService.getTasks();
//    }

    @GetMapping("/tasks/Sorting/{field}")
    public List<Task> getTaskBySorting(@PathVariable String field){
        return taskService.getTaskBySorting(field);
    }

    @GetMapping("/tasks/{Id}")
    public Task getTaskById(@PathVariable String Id)  {
        System.out.println("Task for "+ Id);
        Task task=  taskService.getTaskById(Integer.parseInt(Id)).orElse(null);

        if(task==null){
            throw new taskNotFoundException("Task not Found");
        }

        return task;

    }

    @GetMapping("/tasks/Pagination/{offset}/{pageSize}")
    public Page<Task> getTaskByPagination(@PathVariable int offset, @PathVariable int pageSize){
        return taskService.getTaskByPagination(offset,pageSize);
    }

    @PostMapping("/tasks")
    public Task addTasks(@RequestBody Task task){
        System.out.println("Task Added Successfully");
        return taskService.addTasks(task);
    }

    @PutMapping("/tasks/{Id}")
    public Task modifyTask(@PathVariable String Id,@RequestBody Task updatedtask){
        return taskService.modifyTask(Integer.parseInt(Id),updatedtask );
    }

    @DeleteMapping("/tasks/{Id}")
    public Task deleteTask(@RequestBody @PathVariable String Id){
        return taskService.deleteTask(Integer.parseInt(Id));
    }


}
