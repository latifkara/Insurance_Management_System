package com.javaGelisme;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String name;
    private String surname;
    private String email;
    private String Password;
    private String job;
    private int age;
    private List<Adress> adressList;
    private Date lastLoginDate;

    public User(String name, String surname, String email, String password, String job, int age, Date lastLoginDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        Password = password;
        this.job = job;
        this.age = age;
        this.lastLoginDate = lastLoginDate;
        this.adressList = new ArrayList<Adress>();
    }

    public User() {
        adressList = new ArrayList<Adress>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Adress> getAdressList() {
        return adressList;
    }

    public void setAdressList(List<Adress> adressList) {
        this.adressList = adressList;
    }
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
