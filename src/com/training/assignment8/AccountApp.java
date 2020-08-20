package com.training.assignment8;

import java.util.Scanner;
public class AccountApp {

    public static void main(String[] args)
    {

        Scanner user = new Scanner(System.in);
        Validator valid = new Validator();
        System.out.println("Welcome to the Account application \n");
        System.out.println("Starting Balances");

        Transactions Transaction = new Transactions();
        SavingsAccount Save = new SavingsAccount(.01);
        CheckingAccount Check = new CheckingAccount(1);
        Save.deposit(1000.00);
        Check.deposit(1000.00);
        System.out.println("Checking: $" + Check.getBalance());
        System.out.println("Savings: $" + Save.getBalance());

        System.out.println("Enter the transactions for the month");


        String response = "y";

        while(response.equals("y"))
        {
            String wd = valid.wOrD(user);
            if(wd.equals("w"))
            {
                String cs = valid.cOrS(user);
                if(cs.equals("c"))
                {
                    double number;
                    do {
                        System.out.println("Amount?: ");
                        while (!user.hasNextInt()) {
                            System.out.println("That's not a number!");
                            user.next();
                        }
                        number = user.nextInt();
                    } while (number >= Check.getBalance());
                    Check.withdraw(number);
                }
                else if(cs.equals("s"))
                {
                    double number;
                    do {
                        System.out.println("Amount?: ");
                        while (!user.hasNextInt()) {
                            System.out.println("That's not a number!");
                            user.next();
                        }
                        number = user.nextInt();
                    } while (number <= Save.getBalance() && number >= 0);
                    Save.withdraw(number);
                }
            }
            else if(wd.equals("d"))
            {
                String cs = valid.cOrS(user);
                if(cs.equals("c"))
                {
                    double number;
                    int x = 0;
                    do {
                        System.out.println("Amount?: ");
                        while (!user.hasNextInt()) {
                            System.out.println("That's not a number!");
                            user.next();
                        }
                        number = user.nextInt();
                    } while (number < 0);
                    Save.deposit(number);
                }
                else if(cs.equals("s"))
                {
                    double number;
                    do {
                        System.out.println("Amount?: ");
                        while (!user.hasNextInt()) {
                            System.out.println("That's not a number!");
                            user.next();
                        }
                        number = user.nextInt();
                    } while (number < 0);
                    Save.deposit(number);
                }
            }
            response = valid.yesOrNo(user);
        }


        System.out.println("Monthly Payments and Fees: ");
        Save.calcPay();
        System.out.println("Checking fee:              " + Check.getMonthlyFee());
        System.out.println("Savings interest payment: " + Save.getMonIntPay());

        System.out.println("Final Balances");
        Check.balMonFee();
        System.out.println("Checking: $" + Check.getBalance());
        System.out.println("Savings: $" + Save.getBalance());







    }
}

