package com.javaGelisme;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    User user;
    List<Insurance> insurances = new ArrayList<Insurance>();

    public Account(User user) {
        this.user = user;
    }

    public final void showUserInfo(){
        System.out.println("İsim : "+ user.getName()+
                            "Soyismi : "+ user.getSurname()+
                            "email :: "+ user.getEmail()+
                            "Şifre : "+ user.getPassword()+
                            "Meslek : "+ user.getJob()+
                            "Yaş : "+ user.getAge());
    }

    public  AuthenticationStatus authenticationStatus(String email, String pass) throws InvalidAuthenticationException{
        if (user.getEmail().equals(email) && user.getPassword().equals(pass)){
            return AuthenticationStatus.SUCCESS;
        }else{
            throw  new InvalidAuthenticationException("kullanıcı bulunmadı");
        }
    }



    public abstract void insurancePolicy();



}
