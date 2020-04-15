package com.example.controller;
import com.alibaba.fastjson.JSONObject;
import com.example.bean.UserBean;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class UserController {
    @Autowired
    private UserService userService;

//    @RequestMapping(value = "/user",method = RequestMethod.POST)
//    public boolean addUser(UserBean user){
//        System.out.println("开始新增用户");
//        return userService.addUser(user);
//    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public boolean addUser(@RequestBody UserBean user){
        System.out.println("开始新增用户");
        return userService.addUser(user);
    }

    @RequestMapping(value = "/user",method =RequestMethod.PUT )
    public boolean updateUser(UserBean user){
        System.out.println("开始更新用户");
        return userService.updateUser(user);
    }
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "id",required = true) int id){
        System.out.println("开始删除用户");
        return userService.deleteUser(id);
    }
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public UserBean findByUserName(@RequestParam(value = "username",required = true) String name){
        System.out.println("开始根据用户名字进行查找");
        return userService.findUserByName(name);
    }
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<UserBean> findAll(){
        System.out.println("开始查找所有用户");
        return userService.findAll();
    }
}

