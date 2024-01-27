package com.strings;

import java.util.Scanner;

public class Practise3 {

    public  void advancedLoginAuthentication(){

        //loging in information system
        System.out.println();
        String validUsername = "admin";
        String validPassword = "adminuser";
        String username;
        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the valid username: ");
        username = scanner.next();

        // conditions
        if(username.equals(validUsername)){
            System.out.print("Please enter the valid password: ");
            password = scanner.next();
            if(password.equals(validPassword)){
                System.out.println("Successfully loged in!");
            }else{
                System.out.println("Incorrect password");
            }
        }else{
            System.out.println("Invalid username");
        }
        System.out.println();
    }
}
