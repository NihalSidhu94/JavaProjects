package com.training.assignment6;

public class Employee extends Person {



    String socialSecurity = "";

    public Employee()
    {

    }

    @Override
    public String getDisplayText() {
        String response = "";
        response = "Name: " + firstName + " " + lastName +
                "\n" + "Email: " + email +
                "\n" + "Social security number : " + socialSecurity;
        return response;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }


}
