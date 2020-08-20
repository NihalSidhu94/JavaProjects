package com.training.assignment8;

import java.util.Scanner;
public class Validator {

    Scanner input = new Scanner(System.in);

    public String wOrD(Scanner sc)
    {
        String answer = "";

        System.out.println("Withdrawl or deposit? (w/d): ");
        answer = input.next();
        while (!answer.equals("w") && !answer.equals("d")) {
            System.out.println("Error! This entry is required. Try again.");
            System.out.println("Withdrawl or deposit? (w/d): ");
            answer = input.next();
        }

        return answer;
    }
    public String cOrS(Scanner sc)
    {
        String answer = "";

        System.out.println("Checking or savings? (c/s): ");
        answer = input.next();
        while (!answer.equals("c") && !answer.equals("s")) {
            System.out.println("Error! This entry is required. Try again.");
            System.out.println("Checking or savings? (c/s): ");
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



