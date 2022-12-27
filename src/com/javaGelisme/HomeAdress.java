package com.javaGelisme;

public class HomeAdress implements Adress{
    public HomeAdress() {

    }

    @Override
    public void showAddress() {
        System.out.println("Home Address is : " + "Patika.dev istanbul");
    }
}
