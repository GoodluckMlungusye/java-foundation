package com.polymorphism;

public class Main {
    public static void main(String[] args) {

        //CONSTRUCTOR OVERLOADING
        //with parameters
        ConstructorOverloading.Student rob = new ConstructorOverloading.Student(1051,22,3,"Bsc. in Electronics Science");
        System.out.println();
        System.out.println("By passing parameters:");
        System.out.println(rob.ID_number);
        System.out.println(rob.age);
        System.out.println(rob.yearOfStudy);
        System.out.println(rob.degreeProgramme);
        System.out.println();

        //without parameters
        ConstructorOverloading.Student john = new ConstructorOverloading.Student();
        System.out.println();
        System.out.println("Without passing parameters:");
        System.out.println(john.ID_number);
        System.out.println(john.age);
        System.out.println(john.yearOfStudy);
        System.out.println(john.degreeProgramme);
        System.out.println();
        
        //METHOD OVERLOADING
        MethodOverloading.Students robin = new MethodOverloading.Students();
        System.out.println();
        robin.age();// without parameter
        robin.age(20);// with an integer parameter
        robin.age(20.5F);//with a float parameter
        System.out.println();
    }
}
