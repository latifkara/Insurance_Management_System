package com.javaGelisme;

import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    Scanner scanner = new Scanner(System.in);
    TreeSet<Account> accounts = new TreeSet<Account>();

    public void login(){
        System.out.print("Lütfen kullanıcı ismi giriniz : ");
        String username = scanner.next();
        System.out.print("Lütfen kullanıcı şifresini giriniz : ");
        String password = scanner.next();

        for (Account account:accounts) {
            try {
            account.authenticationStatus(username, password);
            } catch (InvalidAuthenticationException e) {
                e.printStackTrace();
            }
        }
    }

    public void signIn(){
        String adduser;
        do {
            System.out.print("Kullanıcı ismini giriniz :");
            String username = scanner.next();
            System.out.print("Kullanıcı soyadını giriniz :");
            String userSurname = scanner.next();
            System.out.print("Kullanıcı emailini giriniz :");
            String email = scanner.next();
            System.out.print("Kullanıcı şifresini giriniz :");
            String password = scanner.next();
            System.out.print("Kullanıcı mesleğini giriniz :");
            String job = scanner.next();
            System.out.print("Kullanıcı yaşını giriniz :");
            int age = scanner.nextInt();
            User newUser = new User(username, userSurname, email, password, job, age);
            System.out.println("1. Kurumsal Hesap" +
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
            System.out.println("yeni kullanıcı eklemek ister misiniz --> <e>vet <h>ayır");
            adduser = scanner.next();
        }while (adduser.equals("e"));
    }
}
