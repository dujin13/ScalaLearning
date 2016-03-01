package com.scalalearning.c11;

/**
 * Created by gaolp on 2016/3/1.
 */
public class Investment {
    private String investmentName;
    private InvestmentType investmentType;

    public Investment(String name, InvestmentType type) {
        investmentName = name;
        investmentType = type;
    }

    public int yield(){return 0;}
}
