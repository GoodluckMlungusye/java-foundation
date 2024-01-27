package com.lambda;

public class Main {
    public static void main(String[] args) {

        //single expressions with no parameters
        Number number;
        number = () -> 100;
        System.out.println(number.displayNumber());

        //single expressions with parameters
        NumberOperation numberOperation;
        numberOperation = (a,b) -> a*b;
        System.out.println(numberOperation.operate(12,3));

        //block lambda expressions
        Person person;
        person = (age) -> {
            if(age > 18){
                System.out.println("Adult");
            }else{
                System.out.println("Not Adult");
            }
        };

        person.checkForAdult(40);

        //passing lambda expressions as arguments
        System.out.println(Test.display((message) -> {return message;},"Hello"));
    }
}
