package com.TaskMaker.TaskMaker.Service;

import com.TaskMaker.TaskMaker.entity.Task;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    public List<Task> getTasks();

    public Optional<Task> getTaskById(int id);

    public List<Task> getTaskBySorting(String field);

    public Page<Task> getTaskByPagination(int offset, int pageSize);

    public Task addTasks(Task task);

   public Task modifyTask(int id, Task updatedTask);

    public Task deleteTask(int id);
}
