package com.test.dao.Impl;

import com.test.dao.Userdao;
import com.test.domain.User;

import java.util.List;
import java.util.Map;

public class UserDaoImpl implements Userdao {

    private List<String> strList;
    private Map<String, User> userMap;
    private Process properties;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Process properties) {
        this.properties = properties;
    }

    private String username;
    private int age;

    public UserDaoImpl() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //    public void UserDaoImpl(){
//        System.out.println("UserDaoImpl对象创建");
//    }

    public void save(){
//        System.out.println(username+"==="+age);
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save runing...");
    }
}
