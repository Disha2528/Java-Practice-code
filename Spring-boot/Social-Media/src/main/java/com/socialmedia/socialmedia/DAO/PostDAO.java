package com.socialmedia.socialmedia.DAO;

import com.socialmedia.socialmedia.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDAO extends JpaRepository<Post, Integer> {
}
