package com.example.myfirstspringproject.business;

import com.example.myfirstspringproject.domain.IRateofInterest;
import com.example.myfirstspringproject.domain.RateType;

public class PaymentCalculator {

    private double loanAmount;

    private double tenure;

    public PaymentCalculator(double loanAmount, double tenure) {
        this.loanAmount = loanAmount;
        this.tenure = tenure;
    }

    private IRateofInterest interestProvider;

    public double calculatePayment()
    {
        interestProvider = new RateProvider();
        loanAmount =  (loanAmount * interestProvider.getInterestRate(RateType.FIXED) * tenure) / 100;

        return loanAmount;
    }


}
