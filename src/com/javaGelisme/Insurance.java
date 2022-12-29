package com.javaGelisme;

import java.util.Date;

public abstract class Insurance {
    private String insurancename;
    private Double insurancePrice;
    private Date startEndInsurance;

    public Insurance(String insurancename, Double insurancePrice, Date startEndInsurance) {
        this.insurancename = insurancename;
        this.insurancePrice = insurancePrice;
        this.startEndInsurance = startEndInsurance;
    }



    public String getInsurancename() {
        return insurancename;
    }

    public void setInsurancename(String insurancename) {
        this.insurancename = insurancename;
    }

    public Double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(Double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Date getStartEndInsurance() {
        return startEndInsurance;
    }

    public void setStartEndInsurance(Date startEndInsurance) {
        this.startEndInsurance = startEndInsurance;
    }

    public abstract double calculate();
}
