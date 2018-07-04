package com.example.demo.UserDemo.UserDao;

import com.example.demo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * auther   kangwang
 */
@Repository
public interface UserDao extends JpaRepository<User,String> {

}
