package com.training.assignment7;

public class CountUtil {

    public static void count(Countable c, int maxCount)
    {
        while(c.getCount() <= maxCount)
        {
            System.out.println(c.getCountString());
            c.incrementCount();
        }

    }
}

