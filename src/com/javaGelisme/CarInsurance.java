package com.javaGelisme;

import java.util.Date;

public class CarInsurance extends Insurance{

    public CarInsurance(String insurancename, Double insurancePrice, Date startEndInsurance) {
        super(insurancename, insurancePrice, startEndInsurance);
    }

    @Override
    public double calculate() {
        return 243.89;
    }
}
