package com.conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Practise4 {

    final int tableLimit = 10;

    public void multiplicationTable() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        PrintWriter output = new PrintWriter(System.out,true);

        output.println("Enter the table number:");
        String tableNumber = bufferedReader.readLine();
        int tableNum = Integer.parseInt(tableNumber);

        for(int i = 1; i <= tableLimit; i++){
            output.println(tableNum + " X " + i + " = " + tableNum * i);
        }

    }
}
