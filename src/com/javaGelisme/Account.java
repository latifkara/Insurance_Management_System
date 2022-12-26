package com.javaGelisme;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    User user = new User();
    List<Insurance> insurances = new ArrayList<Insurance>();
    public final void showUserInfo(){
        System.out.println("İsim : "+ user.getName()+
                            "Soyismi : "+ user.getSurname()+
                            "email :: "+ user.getEmail()+
                            "Şifre : "+ user.getPassword()+
                            "Meslek : "+ user.getJob()+
                            "Yaş : "+ user.getAge());
    }

    public void authenticationStatus(){

    }

}
