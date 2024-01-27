package com.polymorphism;

public class ConstructorOverloading {

    static class Student{
        int ID_number;
        int age;
        int yearOfStudy;
        String degreeProgramme;

        //constructor with parameters
        Student(int i, int a, int y, String d){
            ID_number = i;
            age = a;
            yearOfStudy = y;
            degreeProgramme = d;
        }

        //constructor without parameters
        Student(){
            ID_number = 1031;
            age = 20;
            yearOfStudy = 1;
            degreeProgramme = "Bsc. in Computer Science";
        }
    }
}
