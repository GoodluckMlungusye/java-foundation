package com.inputOutputStream;

import java.io.*;
import java.util.Scanner;

class Practise extends NegativeAmountException{


    public void saveBalance() throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        PrintWriter output = new PrintWriter(System.out,true);

        output.println("Enter the amount to deposit:");
        String depositAmount = bufferedReader.readLine();
        int amountDeposited = Integer.parseInt(depositAmount);

        try {
            if(amountDeposited < 0){
                throw new NegativeAmountException();
            }else {
                Scanner scanner = new Scanner(new File("balance.txt"));
                int currentBalance = scanner.nextInt();
                output.println("Your Balance before depositing: " + currentBalance);
                output.println("Amount deposited: " + amountDeposited);

                currentBalance += amountDeposited;
                FileOutputStream file = new FileOutputStream("balance.txt");
                String addedAmount = Integer.toString(currentBalance);
                byte[] add = addedAmount.getBytes();
                file.write(add);
                file.close();
                output.println("Your  Balance after depositing: " + currentBalance);
            }

        }catch (NegativeAmountException exception){
            output.println(exception);
        }

    }

}