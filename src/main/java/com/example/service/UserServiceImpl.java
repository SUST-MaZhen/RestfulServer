package com.example.service;

import com.alibaba.fastjson.JSONObject;
import com.example.bean.UserBean;
import com.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @ClassName UserServiceImpl
 * @Author User
 * @date 2020.04.14 21:36
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(UserBean user) {
        boolean flag=false;
        try {
            userDao.addUser(user);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
//        JSONObject object = new JSONObject();
//        //string
//        object.put("string","string");
//        //int
//        object.put("int",2);
//        //boolean
//        object.put("boolean",true);
//        //array
//        List<Integer> integers = Arrays.asList(1,2,3);
//        object.put("list",integers);
//        //null
//        object.put("null",null);
////        return object;
    }

    @Override
    public boolean updateUser(UserBean user) {
        boolean flag=false;
        try {
            userDao.updateUser(user);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(int user) {
        boolean flag=false;
        try {
            userDao.deleteUser(user);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public UserBean findUserByName(String username) {
        return userDao.findByName(username);
    }

    @Override
    public List<UserBean> findAll() {
        return userDao.findAll();
    }
}
