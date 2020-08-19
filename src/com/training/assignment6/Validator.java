package com.training.assignment6;

import java.util.Scanner;
public class Validator {

    Scanner input = new Scanner(System.in);

    public String custOrEmp(Scanner sc)
    {
        String answer = "";

        System.out.println("Create customer or employee? (c/e): ");
        answer = input.next();
        while (!answer.equals("c") && !answer.equals("e")) {
            System.out.println("Error! This entry is required. Try again.");
            System.out.println("Create customer or employee? (c/e): ");
            answer = input.next();
        }

        return answer;
    }

    public String yesOrNo(Scanner sc)
    {
        String answer = "";

        System.out.println("Continue? (y/n): ");
        answer = input.next();
        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.println("Error! This entry is required. Try again.");
            System.out.println("Continue? (y/n): ");
            answer = input.next();
        }
        return answer;
    }

}


