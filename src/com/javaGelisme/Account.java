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
        System.out.println("Isim : "+ user.getName()+"-"+
                            "Soyismi : "+ user.getSurname()+"-"+
                            "email :: "+ user.getEmail()+"-"+
                            "Sifre : "+ user.getPassword()+"-"+
                            "Meslek : "+ user.getJob()+"-"+
                            "Yas : "+ user.getAge()+"-"+
                            "Sigorta Policasi : " + this.insurancePolicy());
    }

    public abstract double insurancePolicy();



}
