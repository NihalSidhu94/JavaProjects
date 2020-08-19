package com.training.assignment6;

public abstract class Person {

    String firstName = "";
    String lastName = "";
    String email = "";

    public Person()
    {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString()
    {
        String response = "";
        response = "Name: " + firstName + " " + lastName +
                "\n" + "Email: " + email;
        return response;
    }

    public abstract String getDisplayText();


}
