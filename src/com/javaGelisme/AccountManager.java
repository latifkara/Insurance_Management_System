package com.javaGelisme;

import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    Scanner scanner = new Scanner(System.in);
    AccountComparable comparable = new AccountComparable();
    TreeSet<Account> accounts = new TreeSet<Account>(comparable);

    public AuthenticationStatus login(){
        System.out.println("-------------Lutfen Giris Yapin----------------");
        System.out.print("Lutfen kullanici ismi giriniz : ");
        String username = scanner.next();
        System.out.print("Lutfen kullanici sifresini giriniz : ");
        String password = scanner.next();
        AuthenticationStatus status;
        try {
            for (Account account:accounts) {
               if (account.user.getName().equals(username) && account.user.getPassword().equals(password)){
                   System.out.println("giris basarili");
                   return AuthenticationStatus.SUCCESS;
               }
            }
            throw new InvalidAuthenticationException("Öğrenci bulunmadı");
        } catch (InvalidAuthenticationException e) {
            e.getMessage();
        }
        return AuthenticationStatus.FAIL;
    }

    public void signIn(){
        String adduser;
        do {
            System.out.println("-------------Lutfen Kayit Yapin----------------");
            System.out.print("Kullanici ismini giriniz :");
            String username = scanner.next();
            System.out.print("Kullanici soyadini giriniz :");
            String userSurname = scanner.next();
            System.out.print("Kullanici emailini giriniz :");
            String email = scanner.next();
            System.out.print("Kullanici Sifresini giriniz :");
            String password = scanner.next();
            System.out.print("Kullanici meslegini giriniz :");
            String job = scanner.next();
            System.out.print("Kullanici yasini giriniz :");
            int age = scanner.nextInt();
            User newUser = new User(username, userSurname, email, password, job, age);
            System.out.println("1. Kurumsal Hesap" +" "+
                    "2. Bireysel Hesap");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    Enterprise enterprise = new Enterprise(newUser);
                    accounts.add(enterprise);
                    break;
                case 2:
                    Individual individual = new Individual(newUser);
                    accounts.add(individual);
                    break;
            }
            System.out.println("yeni kullanici eklemek ister misiniz --> <e>vet <h>ayir");
            adduser = scanner.next();
        }while (adduser.equals("e"));
    }
}
