package com.test.service.impl;

import com.test.dao.Impl.UserDaoImpl;
import com.test.dao.Userdao;
import com.test.service.Userservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserserviceImpl  implements Userservice {
    private Userdao userdao;
    public UserserviceImpl(Userdao userdao) {
        this.userdao = userdao;
    }
    public UserserviceImpl(){

    }
//    public void setUserdao(Userdao userdao){
//        this.userdao = userdao;
//    }




    public void save() {
        userdao.save();

    }
}
