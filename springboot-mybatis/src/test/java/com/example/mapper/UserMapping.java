package com.example.mapper;

import com.example.entity.User;
import com.example.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * auther   kangwang
 * 2018
 */
public interface UserMapping {
    //执行的语句
    @Select("select *from users")
    //字段的映射
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    List<User> getAll();
    @Select("select *from users where id =  #{id}")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    User getOne(Long id);
    @Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
    void insert(User user);
    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(User user);
    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);
}
