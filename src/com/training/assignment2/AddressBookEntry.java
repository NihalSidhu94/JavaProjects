package com.training.assignment2;

public class AddressBookEntry {
    private String name;
    private String emailAddress;
    private String phoneNumber;

    public AddressBookEntry(String nameInput, String emailInput, String phoneInput)
    {
        name = nameInput;
        emailAddress = emailInput;
        phoneNumber = phoneInput;
    }

    public void setName(String nameInput)
    {
        name = nameInput;
    }

    public String getName()
    {
        return name;
    }

    public void setEmail(String emailInput)
    {
        emailAddress = emailInput;
    }

    public String getEmail()
    {
        return emailAddress;
    }

    public void setPhone(String phoneInput)
    {
        phoneNumber = phoneInput;
    }

    public String getphone()
    {
        return phoneNumber;
    }


}
