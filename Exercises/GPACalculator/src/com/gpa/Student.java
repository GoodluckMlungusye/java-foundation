package com.gpa;

import java.io.*;

public class Student {
    String name;
    String registrationNumber;
    String numberOfCourses;
    int numOfCourses;

    void getData() throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        PrintWriter output = new PrintWriter(System.out,true);

        output.println("Enter your name");
        name = bufferedReader.readLine().toUpperCase().trim();
        output.println("Enter your Registration number");
        registrationNumber = bufferedReader.readLine().trim();
        output.println("Enter the number of courses");
        numberOfCourses = bufferedReader.readLine().trim();
        numOfCourses = Integer.parseInt(numberOfCourses);


    }

}
