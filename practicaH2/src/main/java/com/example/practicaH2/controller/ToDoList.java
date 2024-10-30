package com.example.practicaH2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practicaH2.model.Task;
import com.example.practicaH2.service.ITaskService;

@RestController
@RequestMapping (value="todolist")
public class ToDoList {
    
    @Autowired
    private ITaskService taskService;

    @GetMapping(value="tasks")
    public List<Task> getTasks() {
        return taskService.getTask();
    }
    
    
    
}
