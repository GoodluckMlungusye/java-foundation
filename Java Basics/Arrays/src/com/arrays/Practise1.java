package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Practise1 {

    int[] ticketPrice = {100,150,500,20};
    int[] discountTicketPrice = new int[ticketPrice.length];

    public void discount() throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        PrintWriter output = new PrintWriter(System.out,true);

        output.println("Enter a discount in percentage:");
        String discountValue = bufferedReader.readLine();
        int discount = Integer.parseInt(discountValue);

        for( int i = 0; i < ticketPrice.length ; i++){

            discountTicketPrice[i] = (ticketPrice[i] - (ticketPrice[i] * discount) /100);
            output.println(discountTicketPrice[i]);
        }

    }
}
