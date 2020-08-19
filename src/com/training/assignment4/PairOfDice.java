package com.training.assignment4;

public class PairOfDice {

    Die die1 = new Die();
    Die die2 = new Die();
    int sumOfDies;


    public PairOfDice() // default to six-sided dice
    {


    }
    public PairOfDice(int sides)  // allow a variable number of sides
    {
        Die die3 = new Die(sides);
        die1= die3;
        Die die4 = new Die(sides);
        die2 = die4;

    }
    public void roll() {
        die1.roll();
        die2.roll();

    }
    public int getValue1() // get value of die1
    {
        return die1.getValue();

    }
    public int getValue2()  // get value of die2
    {
        return die2.getValue();
    }
    public int getSum() // get the sum of both dice
    {
        sumOfDies = die1.getValue() + die2.getValue();
        return sumOfDies;

    }

}
