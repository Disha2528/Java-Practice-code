package com.socialmedia.socialmedia.Controller;

import com.socialmedia.socialmedia.Entity.Post;
import com.socialmedia.socialmedia.Entity.User;
import com.socialmedia.socialmedia.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller {

    @Autowired
    Service service;

    //Mappings for users

    @GetMapping("/Users")
    public List<User> getUsers(){
        return service.getUsers();
    }

    @PostMapping("/User")
    public User addUser(@RequestBody User user){
        return (User) service.addUser(user);
    }

    @GetMapping("/User/{id")
    public User getUserById(@PathVariable int id){
        return service.getUserById(id);
    }

    @DeleteMapping
    public void deleteUser(@RequestBody @PathVariable int id){
        service.deleteUser(id);
    }

    //Mappings for posts
    @GetMapping("/User/{id}/Posts")
    public List<Post> getPosts(@PathVariable int id){
        return service.getPosts(id);
    }

    @PostMapping("/User/{id}/Posts")
    public Post addPost(@PathVariable int id, Post post){
        return service.addPost(id,post);
    }

    @GetMapping("/User/{id}/Posts/{post_id}")
    public Post getPostById(@PathVariable int id, @PathVariable int post_id){
        return service.getPostById(id,post_id);
    }
}
