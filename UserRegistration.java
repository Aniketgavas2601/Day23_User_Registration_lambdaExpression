package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration{
    public void check_Password_One_UpperCase_One_Numeric_Value_And_One_Special_Character(){
        String password;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password: ");
        password = sc.next();

        //Rule 4 - Minimum 8 Characters With At least Minimum 1 Uppercase, 1 Numeric Value and 1 Special Character
        String regexPassword = "^(?=.*[a-z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{5,}$";

        boolean result = password.matches(regexPassword);

        if(result){
            System.out.println("Password Is Valid");
        }else{
            System.out.println("Password Is Invalid!!");
            System.out.println("Please Enter Minimum 8 Characters With Atleast 1 Uppercase Letter , Atleast 1 Numeric Number & 1 Special character");
            System.out.println("eg: Sample@123");
        }
    }
}
