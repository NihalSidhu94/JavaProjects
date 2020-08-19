package com.training.assignment2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //AddressBookEntry a = new AddressBookEntry();
        //AddressBookIO b = new AddressBookIO();
        //AddressBookEntryApp c = new AddressBookEntryApp();
        //Validator a = new Validator();
        Scanner input = new Scanner(System.in);
        AddressBookEntryApp c = new AddressBookEntryApp();
        c.display(input);

    }
}
