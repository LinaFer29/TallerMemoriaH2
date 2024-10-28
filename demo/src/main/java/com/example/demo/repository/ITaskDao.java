package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Task;

public interface ITaskDao extends CrudRepository<Task, Long> {

}
