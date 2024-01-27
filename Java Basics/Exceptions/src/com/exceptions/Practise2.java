package com.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Practise2 extends NegativeNotAllowed{

    int currentBalance = 1000;

    public void checkAmount() throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        PrintWriter output = new PrintWriter(System.out,true);

        output.println("Enter the amount to deposit:");
        String depositAmount = bufferedReader.readLine();
        int amountDeposited = Integer.parseInt(depositAmount);

        try {
            if(amountDeposited < 0){
                throw new NegativeNotAllowed();
            }
            else{
                currentBalance += amountDeposited;
                output.println("New Balance: " + currentBalance);
            }

        }catch (NegativeNotAllowed exception){

            output.println(exception);

        }

    }
}
