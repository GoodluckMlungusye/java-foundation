package com.polymorphism;

public class MethodOverloading {

    static class Students{

        void age(){
            System.out.println("i'm 20 years old ");
        }
        void age(int a){
            System.out.println("My age is " + a + " years old");
        }
        void age(float b){
            System.out.println("My age is " + b + " years old");
        }
    }
}
