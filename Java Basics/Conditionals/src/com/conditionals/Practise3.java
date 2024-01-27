package com.conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Practise3 {


    public int weekDay() throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        PrintWriter output = new PrintWriter(System.out,true);

        output.println("Enter the day number:");
        String dayNumber = bufferedReader.readLine();
        int dayNum = Integer.parseInt(dayNumber);

        switch (dayNum){
            case 1: output.println("Sunday");
                     break;
            case 2: output.println("Monday");
                    break;
            case 3: output.println("Tuesday");
                    break;
            case 4: output.println("Wednesday");
                    break;
            case 5: output.println("Thursday");
                    break;
            case 6: output.println("Friday");
                    break;
            case 7: output.println("Saturday");
                    break;
            default:output.println("Invalid input");
                    break;
        }

       return dayNum;

    }
}
