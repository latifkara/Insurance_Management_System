package com.javaGelisme;

import java.util.Date;

public class TravelInsurance extends Insurance{

    public TravelInsurance(String insurancename, Double insurancePrice, Date startEndInsurance) {
        super(insurancename, insurancePrice, startEndInsurance);
    }

    @Override
    public double calculate() {
        return 65.23;
    }
}
