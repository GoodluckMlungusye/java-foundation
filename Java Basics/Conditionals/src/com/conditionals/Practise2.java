package com.conditionals;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Practise2 {

    final int minAge = 17;
    final int minHeight = 168;

    public void footballCriteria() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        PrintWriter output = new PrintWriter(System.out,true);

        output.println("Enter your Age:");
        String age = bufferedReader.readLine();
        output.println("Enter your Height:");
        String height = bufferedReader.readLine();


        int myAge = Integer.parseInt(age);
        int myHeight = Integer.parseInt(height);

        if(myAge >= minAge && myHeight >= minHeight){

            output.println("You are qualified to play");
        }
        else if (myAge >= minAge && myHeight < minHeight) {

            output.println("You are not qualified to play");
        }
        else if (myAge <= minAge && myHeight >= minHeight) {

            int yearsLeft = myAge - myHeight;
            output.println("You are not qualified as of now, come back after " + yearsLeft + "years");
        }
        else{
            output.println("You did not meet the requirements");
        }
    }
}
