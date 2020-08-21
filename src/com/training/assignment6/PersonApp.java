package com.training.assignment6;

import java.util.Scanner;

public class PersonApp {

    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Welcome to the Person Tester application");
        Validator valid = new Validator();

        String cont = "y";

        while(cont.equals("y"))
        {
            String userCustOrEmp = valid.custOrEmp(user);
            if(userCustOrEmp.equals("c"))
            {
                Customer userEmp = new Customer();
                System.out.println("Enter first name: ");
                String fName = user.next();
                userEmp.setFirstName(fName);
                System.out.println("Enter last name: ");
                String lName = user.next();
                userEmp.setLastName(lName);
                System.out.println("Enter email address : ");
                String userAdd = user.next();
                userEmp.setEmail(userAdd);
                System.out.println("Customer number : ");
                String userNum = user.next();
                userEmp.setCustomerNumber(userNum);

                System.out.println("You entered: ");
                System.out.println(userEmp.getDisplayText());
                cont = valid.yesOrNo(user);
            }
            else
            {
                Employee userEmp = new Employee();
                System.out.println("Enter first name: ");
                String fName = user.next();
                userEmp.setFirstName(fName);
                System.out.println("Enter last name: ");
                String lName = user.next();
                userEmp.setLastName(lName);
                System.out.println("Enter email address : ");
                String userAdd = user.next();
                userEmp.setEmail(userAdd);
                System.out.println("Social security number: ");
                String userSS = user.next();
                userEmp.setSocialSecurity(userSS);
                System.out.println("You entered: ");
                System.out.println(userEmp.getDisplayText());
                cont = valid.yesOrNo(user);
            }
        }
    }




}
