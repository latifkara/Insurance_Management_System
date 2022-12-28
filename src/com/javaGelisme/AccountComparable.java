package com.javaGelisme;

import java.util.Comparator;

public class AccountComparable implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return o1.user.getName().compareTo(o2.user.getName());
    }
}
