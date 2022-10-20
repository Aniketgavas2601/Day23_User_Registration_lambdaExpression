package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration{
    public void check_Mobile_Number(){
        String mobileNumber;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Mobile Number: ");
        mobileNumber = sc.next();

        String regexMobileNumber = "[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$";

        boolean result = mobileNumber.matches(regexMobileNumber);

        if(result){
            System.out.println("Mobile Number is Valid");
        }else{
            System.out.println("Mobile Number is Invalid!!");
            System.out.println("eg:+917948556486");
            System.out.println("Please Refer Above Format!!");
        }
    }
}
