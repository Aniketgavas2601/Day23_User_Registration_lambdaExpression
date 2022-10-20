package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration{
    public void check_Password_Atleast_One_UpperCase_And_One_Numeric_Value(){
        String password;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password: ");
        password = sc.next();

        //Rule 3 - Minimum 8 Characters With At least Minimum 1 Uppercase And Atleast 1 Numeric Value
        String regexPassword = "^[a-zA-Z0-9]{8,}$";

        boolean result = password.matches(regexPassword);

        if(result){
            System.out.println("Password Is Valid");
        }else{
            System.out.println("Password Is Invalid!!");
            System.out.println("Please Enter Minimum 8 Characters With Atleast 1 Uppercase Letter & Atleast 1 Numeric Number");
        }
    }
}
