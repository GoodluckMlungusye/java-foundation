package com.dataPackage;

import java.util.Scanner;

public class PrimeNumberDecider {

    int number;
    int count = 0;

    public void insertNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
    }

    public void Output(){

        for(int i=1;i<=number;i++){
            if(number%i == 0){
                count++;
            }

        }
        if(count == 2){
            System.out.println(number+ " is a prime number");
            System.out.println();
        }

        else{
            System.out.println(number + " is not a prime number ");
            System.out.println();
        }
    }

}
