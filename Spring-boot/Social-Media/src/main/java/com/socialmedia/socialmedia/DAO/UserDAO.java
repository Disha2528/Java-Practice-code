package com.socialmedia.socialmedia.DAO;

import com.socialmedia.socialmedia.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository <User, Integer>{

}
