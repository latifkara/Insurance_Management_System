package com.javaGelisme;

public abstract class Account {
    User user = new User();
    public final void showUserInfo(){
        System.out.println("İsim : "+ user.getName()+
                            "Soyismi : "+ user.getSurname()+
                            "email :: "+ user.getEmail()+
                            "Şifre : "+ user.getPassword()+
                            "Meslek : "+ user.getJob()+
                            "Yaş : "+ user.getAge());
    }

}
