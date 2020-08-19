package com.training.assignment2;

import java.util.ArrayList;
import java.util.List;
public class AddressBookIO {

    private static AddressBookEntry Bill = new AddressBookEntry("Bill Gates", "bill@microsoft.com",
            "(111)-222-3333");
    private static AddressBookEntry Larry = new AddressBookEntry("Larry Ellison", "larry@oracle.com",
            "(444)-555-6666");
    private static AddressBookEntry Steve = new AddressBookEntry("Steve Jobs", "steve@apple.com",
            "777-888-9999");
    private static ArrayList<AddressBookEntry>  addressList = new ArrayList<AddressBookEntry>(List.of(Bill, Larry, Steve));



    // get a String that displays all entries in columns
    public static String getEntriesString()
    {

        String entries = "";
        String currentEntry = "";
        int x = 0;
        String currentName, currentEmail, currentPhone;
        while(x < addressList.size())
        {
            currentName = addressList.get(x).getName();
            // currentName = String.format("|%-30s|", currentName);
            currentEmail = addressList.get(x).getEmail();
            currentPhone = addressList.get(x).getphone();
            currentEntry =  String.format("%-30s %-30s %-30s", currentName, currentEmail, currentPhone);
            entries += currentEntry;
            entries += "\n";
            x++;
        }
        return entries;
    }

    // save an AddressBookEntry object to the file
    public static boolean saveEntry(AddressBookEntry entry)
    {
        addressList.add(entry);
        return true;
    }


}
