package com.example.service;

import com.alibaba.fastjson.JSONObject;
import com.example.bean.UserBean;

import java.util.List;

public interface UserService {

    JSONObject addUser(UserBean user);

    JSONObject updateUser(UserBean user);

    JSONObject deleteUser(int user);

    UserBean findUserById(String id);

//    List<UserBean> findUserByName(String username);

//    List<UserBean> findAll();
}
