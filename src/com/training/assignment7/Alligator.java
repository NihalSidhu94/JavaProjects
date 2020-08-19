package com.training.assignment7;

public class Alligator implements Countable {
    int count = 1;

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void resetCount() {
        count = 1;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        String countReturn = "";
        countReturn = count + " alligator";
        return countReturn;
    }

}
