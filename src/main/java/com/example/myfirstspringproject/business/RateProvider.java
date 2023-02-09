package com.example.myfirstspringproject.business;

import com.example.myfirstspringproject.domain.IRateofInterest;
import com.example.myfirstspringproject.domain.RateType;

public class RateProvider implements IRateofInterest {
    @Override
    public double getInterestRate(RateType ratetype) {
        return 4.5;
    }
}
