package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration{
    public void minimumThreeCharacterNameWithFirstLetterIsCapital(){
        String lastName;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Last Name: ");
        lastName = sc.next();

        String regexLastName = "^[A-Z]{1}[a-z]{2}[a-z]*$";

        boolean result = lastName.matches(regexLastName);

        if(result){
            System.out.println("It Is Valid Last Name");
        }else{
            System.out.println("It Is Invalid!! Please Enter Minimum Three Character Or Start Last Name With Capital");
        }
    }
}
