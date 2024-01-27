package com.strings;

public class Set1 {

    public static void main(String[] args) {

        // string declaration
        String sentence = "Hello! Welcome to java, This is a sample text";
        System.out.println();
        System.out.println(sentence);

        // determining the length of a string and string concatenation
        System.out.println("The above text has a length of " + sentence.length() + " characters");

        // determining a char at 'n' index position
        System.out.println("The character at index position 7 is " + sentence.charAt(7));

        // Extracting characters from one string to the next
        int initialPosition = 7;
        int finalPosition = 14;
        char newSentence[] = new char[finalPosition-initialPosition];
        sentence.getChars(7, 14, newSentence, 0);
        System.out.println("Below is the new sentence -->");
        System.out.println(newSentence);
        System.out.println();

    }
}
