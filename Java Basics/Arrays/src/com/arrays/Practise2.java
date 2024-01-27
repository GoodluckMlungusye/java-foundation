package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Practise2 {

    public void inputStoreArray() throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        PrintWriter output = new PrintWriter(System.out,true);

        output.println("Enter the amount of numbers to store in the array:");
        String numberCount = bufferedReader.readLine();
        int count = Integer.parseInt(numberCount);
        int[] myArray = new int[count];

        for(int i = 0 ; i < count ; i++){
            int numberPosition = i + 1;
            output.println("Enter a number in position " + numberPosition );
            String numberEntered = bufferedReader.readLine();
            int number = Integer.parseInt(numberEntered);
            myArray[i] = number;

        }

        output.println();
        output.println("Your Number Array is: " + Arrays.toString(myArray));


    }
}
