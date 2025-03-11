package com.TaskMaker.TaskMaker.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Task {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column
    private String Description;

    @Enumerated(EnumType.STRING)
    private status status;


    public enum status{
        PENDING, IN_PROGRESS, COMPLETED
    }

    @Column(nullable = true)
    private LocalDate duedate;

    public Task() {
    }

    public Task(int id,String title, String description, Task.status status, LocalDate duedate) {
        this.id=id;
        this.title = title;
        Description = description;
        this.status = status;
        this.duedate = duedate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }

    public LocalDate getDuedate() {
        return duedate;
    }

    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }


}
