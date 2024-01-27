package com.collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Practise1 practise1 = new Practise1();
        practise1.foodItems();

        Student student1 = new Student("Abay",12,76.9);
        Student student2 = new Student("Bernard",13,86.9);
        Student student3 = new Student("Charles",14,96.9);
        Student student4 = new Student("David",15,66.9);

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println();

        for (Student s : students){

            System.out.println(s.name + "   " + s.id + "   " + s.percentageScore);
        }

    }
}
