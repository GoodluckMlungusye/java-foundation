package com.generics;

public class Main {
    public static void main(String[] args) {

        //for integers
        Demo<Integer> intHeight = new Demo<Integer>(23);
        System.out.println(intHeight.displayHeight());

        //for Strings
        Demo<String> strHeight = new Demo<String>("25");
        System.out.println(strHeight.displayHeight());

        //for double
        Demo<Double> doubleHeight = new Demo<Double>(23.7);
        System.out.println(doubleHeight.displayHeight());

        //string and int
        Demo2<String,Integer> student = new Demo2<String, Integer>("John",56);
        System.out.println(student.studentName);
        System.out.println(student.marks);

        //generic for method only
        Demo3.displayMessage(23);
        Demo3.displayMessage(6.45);
        Demo3.displayMessage("23.45");
    }
}
