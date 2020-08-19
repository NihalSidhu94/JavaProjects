package com.training.assignment1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GuesserNum a = new GuesserNum();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Guess the Number Game");
        System.out.println("************************************");
        a.start();
        a.range(input);
    }
}
