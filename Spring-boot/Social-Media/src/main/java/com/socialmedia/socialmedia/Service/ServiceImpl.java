package com.socialmedia.socialmedia.Service;

import com.socialmedia.socialmedia.DAO.PostDAO;
import com.socialmedia.socialmedia.DAO.UserDAO;
import com.socialmedia.socialmedia.Entity.Post;
import com.socialmedia.socialmedia.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceImpl implements Service{

    @Autowired
    private UserDAO udao;
    private PostDAO pdao;

    @Override
    public List<User> getUsers(){
        return udao.findAll();
    }

    @Override
    public User addUser(User user){
        return (User) udao.save(user);
    }

    @Override
    public User getUserById(int id){
        return (User)udao.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(int id) {
        User user= udao.findById(id).orElse(null);
        udao.delete(user);
    }

    @Override
    public List<Post> getPosts(int id) {
        return List.of((Post)pdao.findById(id).orElse(null));
    }

    @Override
    public Post addPost(int id, Post post) {
        return (Post) pdao.save(post);
    }

    @Override
    public Post getPostById(int id, int postId) {
        List<Post> posts = getPosts(id);

        for(Post post: posts){
            if(post.getId()==postId) return post;
        }

        return null;
    }


}
