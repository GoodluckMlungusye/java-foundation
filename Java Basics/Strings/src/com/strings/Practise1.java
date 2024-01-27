package com.strings;

import java.util.Scanner;

public class Practise1 {

    public void loginAuthentication(){

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = sc.nextLine();

        if (username.length() < 6) {
            System.out.println("Username length should be greater than 5 characters");
        } else {
            System.out.print("Enter your password: ");
            String password = sc.nextLine();
            if (password.length() < 8) {
                System.out.println("Password length should be greater than 7 characters");
            } else {
                System.out.println("Hello " + username + " You are succesfully loged in!");

            }
        }
        System.out.println();
    }
}
