package com.gpa;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        GPACalculator gpaCalculator = new GPACalculator();

        gpaCalculator.getData();
        gpaCalculator.getScorePoint();
        gpaCalculator.displayResult();

    }
}
