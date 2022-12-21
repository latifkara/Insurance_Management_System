package com.javaGelisme;

import java.util.Date;

public abstract class Insurance {
    private String insurancename;
    private Double insurancePrice;
    private Date startEndInsurance;

    public abstract void calculate();
}
