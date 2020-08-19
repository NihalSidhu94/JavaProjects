package com.training.assignment2;

import java.util.Scanner;
public class AddressBookEntryApp {

    private int choice = -1;
    public static AddressBookIO Entries = new AddressBookIO();

    public static String display(Scanner sc) {
        System.out.println("1 - List entries\n" +
                "2 - Add entry\n" +
                "3 - Exit\n");
        //System.out.println("Enter menu number: ");

        Validator validCheck = new Validator();
        int number = validCheck.valid(sc);

        if (number == 1) {
            System.out.println(Entries.getEntriesString());
            display(sc);
        } else if (number == 2) {
            System.out.println("Enter name: ");
            String nameUser = sc.next();
            System.out.println("Enter email: ");
            String emailUser = sc.next();
            System.out.println("Enter phone number: ");
            String phoneUser = sc.next();
            AddressBookEntry newUser = new AddressBookEntry(nameUser, emailUser, phoneUser);
            Entries.saveEntry(newUser);
            display(sc);
        }
        else if(number == 3)
        {
            System.out.println("Goodbye");
        }


        //currentGuess = number;
        //return number;
        return "YUH";
    }

}


