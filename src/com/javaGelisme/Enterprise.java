package com.javaGelisme;

public class Enterprise extends Account{
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public double insurancePolicy() {
        return 20;
    }
}
