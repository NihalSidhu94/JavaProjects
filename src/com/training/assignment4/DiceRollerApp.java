package com.training.assignment4;

import java.util.Scanner;

public class DiceRollerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Paradise Roller application");
        Scanner inputa = new Scanner(System.in);
        String response = "";
        Validator validDice = new Validator();
        response = validDice.validStartResponse(inputa);
        if (response.equals("y")) {
            do {
                Scanner input = new Scanner(System.in);
                Validator validDie = new Validator();
                PairOfDice newDice = new PairOfDice();
                newDice.roll();

                int firstValue = newDice.getValue1();
                int secondValue = newDice.getValue2();
                System.out.println(firstValue);
                System.out.println(secondValue);

                if(firstValue+secondValue == 7)
                {
                    System.out.println("Craps!");
                }
                else if(firstValue+secondValue == 2)
                {
                    System.out.println("Snake eyes!");
                } else if (firstValue+secondValue == 12)
                {
                    System.out.println("Box cars!");
                }
                response = validDie.validResponse(input);
            } while (response.equals("y"));
        }
    }

}
