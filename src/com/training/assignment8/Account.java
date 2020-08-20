package com.training.assignment8;

public class Account implements Depositable, Withdrawable, Balanceable {


    double balance;
    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double amount) {
        balance = amount;
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        balance = balance - amount;
    }
}
