package com.javaGelisme;

public class BusinessAddress implements Adress{
    public BusinessAddress() {

    }

    @Override
    public void showAddress() {
        System.out.println("Business Address is : " + "Patika.dev Ankara ");
    }
}
