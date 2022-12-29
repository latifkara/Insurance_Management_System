package com.javaGelisme;

import java.util.Date;

public class ResidenceInsurance extends Insurance{

    public ResidenceInsurance(String insurancename, Double insurancePrice, Date startEndInsurance) {
        super(insurancename, insurancePrice, startEndInsurance);
    }

    @Override
    public double calculate() {
        return 143.43;
    }
}
