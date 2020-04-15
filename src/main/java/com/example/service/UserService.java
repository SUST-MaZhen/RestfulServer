package com.example.service;

import com.alibaba.fastjson.JSONObject;
import com.example.bean.UserBean;

import java.util.List;

public interface UserService {

    boolean addUser(UserBean user);

    boolean updateUser(UserBean user);

    boolean deleteUser(int user);

    UserBean findUserByName(String username);

    List<UserBean> findAll();
}
