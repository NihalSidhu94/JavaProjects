package com.training.assignment4;

import java.util.Scanner;

public class Validator {

    public static String validResponse(Scanner sc)
    {
        String answer = "";
        System.out.println("Roll again? (y/n) : ");
        answer = sc.next();
        while (!answer.equals("y") && !answer.equals("n") ) {
            System.out.println("Error! Entry must be 'y' or 'n'. Roll again? (y/n) : ");
            answer = sc.next();
        }
        return answer;
    }
    public static String validStartResponse(Scanner sc)
    {
        String answer = "";
        System.out.println("Roll the dice? (y/n) : ");
        answer = sc.next();
        while (!answer.equals("y") && !answer.equals("n") ) {
            System.out.println("Error! Entry must by 'y' or 'n'. Roll again? (y/n) : ");
            answer = sc.next();
        }
        return answer;

    }

}

