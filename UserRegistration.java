package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration{
    public void check_Enter_Email_Validity(){
        String emailId;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email: ");
        emailId = sc.next();

        String regexEmailId = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

        boolean result = emailId.matches(regexEmailId);

        if(result){
            System.out.println("Email Id Is Valid");
        }else{
            System.out.println("oops Something Went Wrong!!");
            System.out.println("Please Enter All Required Fields");
            System.out.println("eg:example.samplemail@gmail.com");
        }
    }
}
