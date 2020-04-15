package com.example.dao;
import com.example.bean.UserBean;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper //表示接口基于此注解实现CRUD
public interface UserDao {

    @Insert("insert into user(name,age) values(#{name},#{age})")
    public void addUser(UserBean user);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(UserBean user);

    @Delete("delete from user where id=#{id}")
    void deleteUser(int id);

    @Select("select id,name,age FROM user where name=#{name}")
    UserBean findByName(@Param("name")String username);

    @Select("select id,name,age FROM user")
    List<UserBean> findAll();

}
