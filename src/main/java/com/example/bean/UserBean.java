package com.example.bean;

/**
 * @Description
 * @ClassName User
 * @Author User
 * @date 2020.04.12 22:18
 */
public class UserBean {
    private int id;
    private String name;
    private int age;

    public UserBean(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
