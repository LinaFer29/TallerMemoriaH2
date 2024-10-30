package com.example.practicaH2.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.practicaH2.model.Task;

public interface ITaskDao extends CrudRepository<Task, Long> {

}
