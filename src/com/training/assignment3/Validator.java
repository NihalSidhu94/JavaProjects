package com.training.assignment3;

import java.util.Scanner;

public class Validator {
    //private double value;
    public static double validNum(Scanner sc)
    {
        double number;
        // System.out.println("Enter number: ");
        do {
            System.out.println("Enter radius: ");
            while (!sc.hasNextDouble()) {
                System.out.println("That's not a positive number! Try again!");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);
        return number;
    }

    public static String validResponse(Scanner sc)
    {
        String answer = "";
        System.out.println("Continue? (y/n) : ");
        answer = sc.next();
        while (!answer.equals("y") && !answer.equals("n") ) {
            System.out.println("Error! Entry must by 'y' or 'n'. Try again? (y/n) : ");
            answer = sc.next();
        }
        return answer;

    }
}

