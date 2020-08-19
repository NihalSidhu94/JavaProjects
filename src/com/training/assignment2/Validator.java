package com.training.assignment2;

import java.util.Scanner;
public class Validator {

    public static int valid(Scanner sc)
    {
        int number;
        // System.out.println("Enter number: ");
        do {
            System.out.println("Enter menu number: ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0 || number > 3);
        return number;
    }

}
