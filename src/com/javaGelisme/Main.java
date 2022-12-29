package com.javaGelisme;

public class Main {

    public static void main(String[] args) {
        //AddressManager manager = new AddressManager();
        AddressManager.addItem();
        AccountManager accountManager = new AccountManager();
        accountManager.signIn();
        System.out.println(accountManager.login());
        for (Account account:accountManager.accounts) {
            account.showUserInfo();
            System.out.println("-----------------");
        }
    }
}
