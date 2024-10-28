package com.example.demo.repository;
import java.util.List;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
 
import com.example.demo.model.Usuario;
 
@Repository
public class UserRepository {
    
    public static final String USER_KEY = "USER";
 
    private HashOperations hashOperations;
 
    private RedisTemplate redisTemplate;
 
    public UserRepository(RedisTemplate redisTemplate){
        this.redisTemplate = redisTemplate;
        this.hashOperations = this.redisTemplate.opsForHash();
    }
 
    public void save(Usuario usuario) {
        hashOperations.put(USER_KEY, usuario.getId(), usuario);
    }
 
    public List findAll(){
        return hashOperations.values(USER_KEY);
    }
 
    public Usuario findById(String id) {
        return (Usuario) hashOperations.get(USER_KEY, id);
    }
 
    public void update(Usuario usuario) {
        save(usuario);
    }
 
    public void delete(String id) {
        hashOperations.delete(USER_KEY, id);
    }
 
}
