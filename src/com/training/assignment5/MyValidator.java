package com.training.assignment5;


import java.util.Scanner;
public class MyValidator extends OOValidator {


    public MyValidator(Scanner sc)
    {
        input =sc;
    }


    public String getRequiredString(String prompt)
    {
        String response;

        System.out.println(prompt);
        while (!input.hasNext()) {
            System.out.println("Error! This entry is required. Try again.");
            System.out.println(prompt);
            input.next();
        }
        response = input.next();
        return response;

    }
    public String getChoiceString(String prompt, String s1, String s2)
    {
        String answer = "";

        System.out.println(prompt);
        answer = input.next();
        while (!answer.equals(s1) && !answer.equals(s2) ) {
            System.out.println("Error! This entry is required. Try again.");
            System.out.println(prompt);
            answer = input.next();
        }

        return answer;
    }


}


