package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration{
    public void check_Password_Atleast_One_UpperCase(){
        String password;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password: ");
        password = sc.next();

        //Rule 2 - Minimum 8 Characters With At least Minimum 1 Uppercase
        String regexPassword = "^[A-Z]{1}[a-zA-Z]{7,}$";

        boolean result = password.matches(regexPassword);

        if(result){
            System.out.println("Password Is Valid");
        }else{
            System.out.println("Password Is Invalid!!");
            System.out.println("Please Enter Minimum 8 Characters With Atleast 1 Uppercase Letter");
        }
    }
}
