package com.strings;

public class Set3 {

    public static void main(String[] args) {
        String paragraph = "   This is a text";
        String sentence;


        // finding a substring
        System.out.println();
        System.out.println(paragraph);
        System.out.println();
        sentence = paragraph.substring(3, 7);
        System.out.println(sentence);


        // replace method
        System.out.println();
        sentence = paragraph.replace("text", "line");
        System.out.println(sentence);

        // removing white spaces
        System.out.println();
        System.out.println(paragraph.trim());
        System.out.println();


        // Join method in strings
        String date = String.join("/", "09" , "06" , "2021");
        System.out.println(date);
        System.out.println();
    }
}
