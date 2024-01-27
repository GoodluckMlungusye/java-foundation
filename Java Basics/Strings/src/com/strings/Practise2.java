package com.strings;

public class Practise2 {

    public  void letterFrequency(){

        System.out.println();
        String paragraph = "Exercise is the best way to keep your body and mind healthy";
        int count = 0;
        int frequency;
        for (frequency=0;frequency<paragraph.length();frequency++){
            if(paragraph.charAt(frequency) == 'e'){
                count++;
            }
        }
        System.out.println("The letter 'e' has appeared " + count + " times" );
        System.out.println();
    }
}
