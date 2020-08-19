package com.training.assignment6;

public class Customer extends Person{
    String customerNumber = "";

    public Customer()
    {

    }

    @Override
    public String getDisplayText() {
        String response = "";
        response = "Name: " + firstName + " " + lastName +
                "\n" + "Email: " + email +
                "\n" + "Customer number: " + customerNumber;
        return response;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }


}
