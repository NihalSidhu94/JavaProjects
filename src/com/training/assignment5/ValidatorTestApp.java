package com.training.assignment5;

import java.util.Scanner;

public class ValidatorTestApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Validation Tester application");
        Scanner user = new Scanner(System.in);
        MyValidator valid = new MyValidator(user);
        String intPrompt = "Enter an integer between -100 and 100: ";
        String doublePrompt = "Enter any number between -100 and 100: ";
        String stringTest = "Enter your email address: ";
        String choiceTest = "Select one (x/y):";

        System.out.println("Int Test");
        valid.getIntWithinRange(intPrompt, 0, 100);
        System.out.println();
        System.out.println("Double Test");
        valid.getDoubleWithinRange(doublePrompt, 0, 100);
        System.out.println();
        System.out.println("Required String Test");
        valid.getRequiredString(stringTest);
        System.out.println();
        System.out.println("Required Choice Test");
        valid.getChoiceString(choiceTest, "x", "y");







    }

}
