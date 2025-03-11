package com.socialmedia.socialmedia.Service;

import com.socialmedia.socialmedia.Entity.Post;
import com.socialmedia.socialmedia.Entity.User;

import java.util.List;

public interface Service {

    public List<User> getUsers();

    public User addUser(User user);

    public User getUserById(int id);

    public void deleteUser(int id);

    public List<Post> getPosts(int id);

    public Post addPost(int id, Post post);

    public Post getPostById(int id, int postId);
}
