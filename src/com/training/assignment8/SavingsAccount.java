package com.training.assignment8;

public class SavingsAccount extends Account {

    double monIntRate = 0;
    double monIntPay = 0;

    public SavingsAccount(double rate)
    {
        monIntRate = rate;
    }

    public void calcPay()
    {
        monIntPay = balance * monIntRate;
        balance = balance + monIntPay;

    }

    public double getMonIntPay()
    {
        return monIntPay;
    }
}

