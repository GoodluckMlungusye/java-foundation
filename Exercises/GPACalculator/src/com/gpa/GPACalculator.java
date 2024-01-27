package com.gpa;

import java.util.Scanner;

public class GPACalculator extends Student{

String courseGrade;
int courseCredit;
int pointValue;
double totalScore = 0;
int totalCredit = 0;
double GPA;
String comment;

int count = 1;

double getScorePoint(){

    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);

    while (count <= numOfCourses){

        System.out.println();
        System.out.print("Enter the grade obtained in course " + count + ": ");
        courseGrade = scanner.nextLine().toUpperCase().trim();
        System.out.print("Enter the credit of course " + count + ": ");
        courseCredit = scanner1.nextInt();

        switch (courseGrade) {
            case "A" -> pointValue = 5;
            case "B+" -> pointValue = 4;
            case "B" -> pointValue = 3;
            case "C" -> pointValue = 2;
            case "D" -> pointValue = 1;
            case "E" -> pointValue = 0;
            default -> System.out.println("Invalid grade");
        }

        totalScore += courseCredit * pointValue;
        totalCredit += courseCredit;
        count++;

    }

    return GPA = Math.round((totalScore/totalCredit)*10.0)/10.0;
}

    String  getComment(){

    if (GPA >= 4.4){
        comment = "Excellent, You got the first class!";
    }
    else if (GPA >= 3.5 && GPA <= 4.3) {
        comment = "Very good, You got the upper second class!";
    }
    else if (GPA >= 2.7 && GPA <= 3.4) {
        comment = "Good, You got the lower second class!";
    }
    else if (GPA >= 2.0 && GPA <= 2.6) {
            comment = "You Passed";
    }
    else {
        comment = "You Failed!";
    }
        return comment;
    }

    void displayResult(){

        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Number of courses taken: " + numberOfCourses);
        System.out.println("You got a GPA of " + getScorePoint() + " points." + " " + getComment());
    }

}
