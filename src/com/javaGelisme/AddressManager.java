package com.javaGelisme;

import java.util.Scanner;

public class AddressManager {

    public static User user = new User();;
    public static Scanner scanner = new Scanner(System.in);
    public AddressManager(){

    }
    public static void addItem(){
        System.out.println("1. Ev adresi "+
                            "2. iş yeri adresi");
        int select = scanner.nextInt();
        switch (select){
            case 1:
                user.getAdressList().add(new HomeAdress());
                user.getAdressList().get(0).showAddress();
                break;
            case 2:
                user.getAdressList().add(new BusinessAddress());
                user.getAdressList().get(0).showAddress();

        }

    }

    public static void deleteItem(){
        System.out.println("Silmek istediğiniz Adresi giriniz ");
        int address = scanner.nextInt();
        user.getAdressList().remove(address-1);

    }
}
