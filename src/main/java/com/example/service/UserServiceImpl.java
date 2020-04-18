package com.example.service;

import com.alibaba.fastjson.JSONObject;
import com.example.bean.UserBean;
import com.example.dao.UserDao;
import com.example.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public JSONObject addUser(UserBean user) {
        JSONObject object = new JSONObject();
        try {
            String id = Utils.getUUID();
            user.setId(id);
            userDao.addUser(user);
            object.put("errCode",0);
            object.put("msg","add success");
            object.put("data",user);
        }catch(Exception e){
            e.printStackTrace();
        }
        return object;
    }

    @Override
    public JSONObject updateUser(UserBean user) {
        JSONObject object = new JSONObject();
        try {
            userDao.updateUser(user);
            object.put("errCode",0);
            object.put("msg","update success");
            object.put("data",user);
        }catch(Exception e){
            e.printStackTrace();
        }
        return object;
    }

    @Override
    public JSONObject deleteUser(int user) {
        JSONObject object = new JSONObject();
        try {
            userDao.deleteUser(user);
            object.put("errCode",0);
            object.put("msg","delete success");
            object.put("data",user);

        }catch(Exception e){
            e.printStackTrace();
        }
        return object;
    }

    @Override
    public UserBean findUserById(String id) {
        return userDao.findById(id);
    }

//    @Override
//    public List<UserBean> findUserByName(String username) {
//        return userDao.findByName(username);
//    }

//    @Override
//    public List<UserBean> findAll() {
//        return userDao.findAll();
//    }
}
