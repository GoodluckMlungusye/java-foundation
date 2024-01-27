package com.conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Practise1 {

    public void remarks() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        PrintWriter output = new PrintWriter(System.out,true);

        output.println("Enter your marks in Percentage:");
        String marks = bufferedReader.readLine();

        int myMarks = Integer.parseInt(marks);

        if(myMarks >= 35 && myMarks <=100){

            output.println("You Passed");
        } else if (myMarks < 35 && myMarks >= 0) {

            output.println("You Failed");
        }
        else {
            output.println("Invalid Marks");
        }

    }

}
