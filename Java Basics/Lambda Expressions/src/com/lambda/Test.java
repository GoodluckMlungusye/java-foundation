package com.lambda;

public class Test {
    static String display(TestInterface testInterface, String message){

        return testInterface.test(message);
    }
}
