package com.training.assignment1;
import java.util.Scanner;

public class GuesserNum
{int totalGuesses = 0;
    double randomNum = Math.random();
    int randNum = (int) (randomNum * 100);
    int currentGuess = -1;


    public double start()
    {
        System.out.println("I'm thinking of a number from 1 to 100.");
        System.out.println("Try to guess it.");
        return 1.0;
    }


    // Asks questions and checks if person's value is valid
    public double validNumber(Scanner sc) {
        //System.out.println("I'm thinking of a number from 1 to 100.");
        //System.out.println("Try to guess it.");

        int number;
        // System.out.println("Enter number: ");
        do {
            System.out.println("Enter number: ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0 || number > 100);
        //System.out.println("Thank you! Got " + number);
        currentGuess = number;
        return number;
    }

    // Checks how far or close the value is to the random value.
    // too high or too low
    // Returns guesses once complete.
    public double range(Scanner sca)
    {
        randomNum = Math.random();
        randNum = (int) (randomNum * 100);
        totalGuesses = 0;
        validNumber(sca);
        totalGuesses++;
        while(currentGuess != randNum) {
            int difference = currentGuess - randNum;
            if (difference > 10)
            {
                System.out.println("Way too high!");
                validNumber(sca);
                totalGuesses++;
            }
            if(difference < 10 && difference > 0)
            {
                System.out.println("Too High!");
                validNumber(sca);
                totalGuesses++;
            }
            if(difference < 0)
            {
                System.out.println("Too Low");
                validNumber(sca);
                totalGuesses++;
            }
        }
        if(currentGuess == randNum)
        {
            System.out.println("You got it in " + totalGuesses + " tries.");
            if(totalGuesses<=3)
            {
                System.out.println("Great work! You are a mathematical wizard");
            }
            else if(totalGuesses > 3 && totalGuesses <= 7)
            {
                System.out.println("Not too bad, you've got some potential.");
            }
            else {
                System.out.println("What took you so long? Maybe you should take some lessons.");
            }
        }
        restart(sca);
        return 2.0;
    }

    public double restart (Scanner scab)
    {
        String answer = " ";
        // System.out.println("Enter number: ");

        System.out.println("Try again? (y/n) : ");
        answer = scab.next();
        while (!answer.equals("y") && !answer.equals("n") ) {
            System.out.println("Error! Entry must by 'y' or 'n'. Try again? (y/n) : ");
            answer = scab.next();
        }
        if(answer.equals("y"))
        {
            start();
            range(scab);
        }
        else if(answer.equals("n"))
        {
            System.out.println("Bye - Come back soon!");
        }
        return 3.0;
    }

}

