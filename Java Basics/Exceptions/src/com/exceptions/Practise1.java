package com.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Objects;

public class Practise1 extends InvalidUserIdException{

    public void userId() throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        PrintWriter output = new PrintWriter(System.out,true);

        output.println("Enter the user ID:");
        String userId = bufferedReader.readLine();

        try {
            if(!userId.equals("1234")){
                throw new InvalidUserIdException();
            }
            else{
                output.println("Accepted");
            }

        }catch (InvalidUserIdException exception){

            output.println(exception);

        }

    }


}
