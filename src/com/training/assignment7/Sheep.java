package com.training.assignment7;

public class Sheep implements Countable, Cloneable   {

    int count = 1;
    String name = "";

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void resetCount() {
        count = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        String statement = "";
        statement = count + " " + name;
        return statement;
    }

    public Object clone()throws CloneNotSupportedException{
        return (Sheep)super.clone();
    }
}
