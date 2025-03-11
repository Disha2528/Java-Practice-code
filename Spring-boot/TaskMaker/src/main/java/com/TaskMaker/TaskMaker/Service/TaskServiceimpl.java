package com.TaskMaker.TaskMaker.Service;

import com.TaskMaker.TaskMaker.DAO.Taskdao;
import com.TaskMaker.TaskMaker.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceimpl implements TaskService {

    @Autowired
    private Taskdao taskdao;

//    private final Random random = new Random();
//
//    private static final String[] TITLE_WORDS = {
//            "Fix", "Update", "Refactor", "Implement", "Design", "Optimize",
//            "Test", "Document", "Debug", "Review", "Analyze", "Deploy", "Enhance"
//    };
//
//    private static final String[] Description = {
//            "Enhances performance", "Fixes critical bug", "Introduces new UI",
//            "Improves security", "Refactors old code", "Optimizes database queries"
//    };
//
//
////    @PostConstruct
//    @Transactional
//    public void postTasks() {
//
//        for(int i=0;i<50;i++){
//            taskdao.save(new Task(i,getRandomTitle(),getRandomDescription(),getRandomStatus(),getRandomDate()));
//        }
//
//
//
//    }

//    public String getRandomTitle() {
//        return TITLE_WORDS[random.nextInt(TITLE_WORDS.length)] + " Feature " + (random.nextInt(100) + 1);
//    }
//
//    public Task.status getRandomStatus() {
//        Task.status[] statuses = Task.status.values();
//        return statuses[random.nextInt(statuses.length)];
//    }
//
//    public LocalDate getRandomDate() {
//        int daysBack = random.nextInt(365);
//        return LocalDate.now().minusDays(daysBack);
//    }
//
//    public String getRandomDescription() {
//        return Description[random.nextInt(Description.length)];
//    }

    @Override
    public List<Task> getTasks() {
        return taskdao.findAll();
    }

    @Override
    public Optional<Task> getTaskById(int id) {
        return taskdao.findById(id);
    }

    @Override
    public List<Task> getTaskBySorting(String field) {
        return taskdao.findAll(Sort.by( field));
    }

    @Override
    public Page<Task> getTaskByPagination(int offset, int pageSize){
        return  taskdao.findAll(PageRequest.of(offset,pageSize));
    }

    @Override
    public Task addTasks(Task task) {
        return taskdao.save(task);
    }

    @Override
    public Task modifyTask(int id, Task updatedTask) {
        Task entity = taskdao.findById(id).orElse(null);
        if (entity != null) {
            entity.setTitle(updatedTask.getTitle());
            entity.setDescription(updatedTask.getDescription());
            entity.setStatus(updatedTask.getStatus());
            entity.setDuedate(updatedTask.getDuedate());
            return taskdao.save(entity);
        }
        return null; // Task not found
    }

    @Override
    public Task deleteTask(int id) {
        Optional<Task> entity = taskdao.findById(id);
        if (entity.isPresent()) {
            taskdao.delete(entity.get());
            return entity.get();
        }
        return null; // Task not found
    }
}
