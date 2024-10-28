package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Task;
import com.example.demo.repository.ITaskDao;

@Service
public class TaskService implements ITaskService {
    
    @Autowired
    private ITaskDao taskDao;
    
    /**
     * Method to get all the task
     * @return
     */
    public List<Task> getTask() {
        return (List<Task>) taskDao.findAll();
    }
}

