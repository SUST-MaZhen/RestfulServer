package com.example.dao;
import com.example.bean.UserBean;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper //表示接口基于此注解实现CRUD
public interface UserDao {

    // create
    @Insert("insert into user(id, name,age) values(#{id},#{name},#{age})")
    void addUser(UserBean user);

    // update
    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(UserBean user);

    // delete
    @Delete("delete from user where id=#{id}")
    void deleteUser(int id);

    // research
    @Select("select id,name,age FROM user where id=#{id}")
    UserBean findById(@Param("id")String id);

//    @Select("select id,name,age FROM user where name=#{name}")
//    List<UserBean> findByName(@Param("name")String username);

//    @Select("select id,name,age FROM user")
//    List<UserBean> findAll();

}
