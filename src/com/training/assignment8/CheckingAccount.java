package com.training.assignment8;

public class CheckingAccount extends Account {

    double monthlyFee = 0;

    CheckingAccount(double fee)
    {
        monthlyFee = fee;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void balMonFee()
    {
        balance = balance - monthlyFee;
    }
}

