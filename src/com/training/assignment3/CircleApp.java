package com.training.assignment3;

import java.util.Scanner;
public class CircleApp {

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Circle Tester");
        String response = "";
        do{
            Scanner input = new Scanner(System.in);
            Validator validRad = new Validator();
            double radius = validRad.validNum(input);
            Circle testCircle = new Circle(radius);
            System.out.println("Circumference: " + testCircle.getFormattedCircumference());
            System.out.println("Area: " + testCircle.getFormattedArea());
            response = validRad.validResponse(input);
        } while(response.equals("y"));

        System.out.println("Goodbye. You created " + Circle.getObjectCount() + " Circle object(s)" );
    }

}

