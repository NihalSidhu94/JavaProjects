package com.training.assignment4;

public class Die {
    int value;
    int sides;
    public Die() // default to a six-sided die
    {
        sides = 6;
    }
    public Die(int sides) // allow a variable number of sides
    {
        this.sides = sides;
    }
    public void roll()
    {
        value = (int) (Math.random() * sides);
        if (value == 0)
            value = 6;
    }
    public int getValue()
    {
        return value;
    }
}

