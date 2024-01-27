package com.strings;

public class Set2 {

    public static void main(String[] args) {

        String s1 = "John";
        String s2 = "Rob";
        String s3 = "john";

        // String comparison
        System.out.println();
        System.out.println("Comparing John with Rob strings");
        if(s1.equals(s2)){
            System.out.println("The two strings match!");
        }else{
            System.out.println("The two strings do not match");
        }


        System.out.println();
        System.out.println("Comparing John with john strings");
        if(s1.equalsIgnoreCase(s3)){
            System.out.println("The two strings match!");
        }else{
            System.out.println("The two strings do not match");
        }
        // region matches
        System.out.println();
        System.out.println(s1.regionMatches(1, s3, 1, 3));
        System.out.println();


    }
}
