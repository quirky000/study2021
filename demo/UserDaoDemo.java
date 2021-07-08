package com.test.demo;


import com.test.dao.Userdao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Userdao userdao = (Userdao) app.getBean("userdao");
        userdao.save();
        System.out.println(userdao);
    }
}
