package com.javaGelisme;

import java.util.Date;

public class HealthInsurance extends Insurance{

    public HealthInsurance(String insurancename, Double insurancePrice, Date startEndInsurance) {
        super(insurancename, insurancePrice, startEndInsurance);
    }

    @Override
    public double calculate() {
        return 100.30;
    }
}
