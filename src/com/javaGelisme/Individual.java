package com.javaGelisme;

public class Individual extends Account{

    public Individual(User user) {
        super(user);
    }

    @Override
    public double insurancePolicy() {
        return 10;
    }
}
