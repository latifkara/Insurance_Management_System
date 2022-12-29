package com.javaGelisme;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    Scanner scanner = new Scanner(System.in);
    AccountComparable comparable = new AccountComparable();
    TreeSet<Account> accounts = new TreeSet<Account>(comparable);
    Account account;

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
            Date date = new Date();
            User newUser = new User(username, userSurname, email, password, job, age, date);
            System.out.println("1. Kurumsal Hesap" +" "+
                    "2. Bireysel Hesap");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    account = new Enterprise(newUser);
                    break;
                case 2:
                    account= new Individual(newUser);
                    break;
            }

            System.out.println(" 1- ozel saglık sigortasu "+
                                "2- konut sigortasi " +
                                "3- seyahat sigortasi "+
                                "4- otomobil sigortasi ");
            System.out.print("Kullanici icin sigorta turu seciniz : ");
            int sigorta = scanner.nextInt();
            System.out.println("-------------Sigorta Bilgileri Giriniz-------------");
            System.out.print("sigorta ismini giriniz : ");
            String insuranceName = scanner.next();
            System.out.print("sigorta fiyatını giriniz : ");
            Double insurancePrice = scanner.nextDouble();
            //LocalDateTime date = LocalDateTime.now();
            switch (sigorta){
                case 1:
                    account.insurances.add(new HealthInsurance(insuranceName, insurancePrice, date));
                    break;
                case 2:
                    account.insurances.add(new ResidenceInsurance(insuranceName, insurancePrice, date));
                    break;
                case 3:
                    account.insurances.add(new TravelInsurance(insuranceName, insurancePrice, date));
                    break;
                case 4:
                    account.insurances.add(new CarInsurance(insuranceName, insurancePrice, date));
                    break;
            }
            accounts.add(account);
            System.out.println("yeni kullanici eklemek ister misiniz --> <e>vet <h>ayir");
            adduser = scanner.next();
        }while (adduser.equals("e"));
    }
}
