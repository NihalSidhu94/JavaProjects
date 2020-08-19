package com.training.assignment7;

public class CountTestApp {

    public static void main(String[] args)
    {
        Alligator animalAll = new Alligator();
        CountUtil animalCounter = new CountUtil();
        System.out.println("Counting alligators... \n");
        animalCounter.count(animalAll, 3);
        System.out.println("\n");


        System.out.println("Counting sheep... \n");
        Sheep animalShe = new Sheep();
        animalShe.setName("Blackie");
        animalCounter.count(animalShe, 2);
        System.out.println("\n");




        try{
            Sheep animalDol = (Sheep) animalShe.clone();
            animalDol.setName("Dolly");
            animalDol.resetCount();
            animalCounter.count(animalDol, 3);
            System.out.println("\n");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        animalShe.resetCount();
        animalCounter.count(animalShe, 1);


    }



}
