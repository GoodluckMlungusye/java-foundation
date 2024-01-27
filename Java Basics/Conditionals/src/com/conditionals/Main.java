package com.conditionals;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Practise1 practise1 = new Practise1();
        Practise2 practise2 = new Practise2();
        Practise3 practise3 = new Practise3();
        Practise4 practise4 = new Practise4();
        practise1.remarks();
        practise2.footballCriteria();
        int result = practise3.weekDay();
        System.out.println("Day Number is: " + result);
        practise4.multiplicationTable();




    }
}
