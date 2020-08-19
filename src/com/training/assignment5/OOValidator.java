package com.training.assignment5;

import java.util.Scanner;

public class OOValidator {

    Scanner input = new Scanner(System.in);

    public OOValidator()
    {

    }

    public OOValidator(Scanner sc)
    {
        input = sc;
    }
    public int getInt(String prompt) // Int test
    {
        int number;

        System.out.println(prompt);
        while (!input.hasNextInt()) {
            System.out.println("Error! Invalid integer value. Try again");
            System.out.println(prompt);
            input.next();
        }
        number = input.nextInt();
        return number;
    }

    public int getIntWithinRange(String prompt, int min, int max) //int test between values
    {
        int number = -10;
        int counter = 0;
        System.out.println(prompt);
        while(counter == 0) {
            while (!input.hasNextInt()) {
                System.out.println("Error! Invalid integer value. Try again");
                System.out.println(prompt);
                input.next();
            }
            number = input.nextInt();
            if(number >= min && number <= max) {
                counter = 1;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again");
                System.out.println(prompt);
            }
        }
        return number;
    }
    public double getDouble(String prompt) //double test
    {
        double number;

        System.out.println(prompt);
        while (!input.hasNextDouble()) {
            System.out.println("Error! Invalid integer value. Try again");
            System.out.println(prompt);
            input.next();
        }
        number = input.nextDouble();
        return number;
    }
    public double getDoubleWithinRange(String prompt, double min, double max) // double test between values
    {
        double number = -10;
        int counter = 0;
        System.out.println(prompt);
        while(counter == 0) {
            while (!input.hasNextDouble()) {
                System.out.println("Error! Invalid integer value. Try again");
                System.out.println(prompt);
                input.next();
            }
            number = input.nextDouble();
            if(number >= min && number <= max) {
                counter = 1;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again");
                System.out.println(prompt);
            }
        }
        return number;
    }

}
