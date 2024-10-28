package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.demo.model.Usuario;
import com.example.demo.repository.UserRepository;
 
@RestController
@CrossOrigin
@RequestMapping("/users")
public class ApiUserController {
 
    @Autowired
    private UserRepository userRepository;
 
    @PostMapping
    public Usuario save(@RequestBody Usuario usuario){
        userRepository.save(usuario);
        return usuario;
    }
 
    @GetMapping
    public List list(){
        return userRepository.findAll();
    }
 
    @GetMapping("/{id}")
    public Usuario getUser(@PathVariable String id){
        return userRepository.findById(id);
    }
 
    @PutMapping
    public Usuario update(@RequestBody Usuario usuario){
        userRepository.update(usuario);
        return usuario;
    }
 
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id){
        userRepository.delete(id);
        return id;
    }
 
}