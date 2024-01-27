package com.dataPackage;

public class Circle {

    int xAxis;
    int yAxis;
    int Radius;


    Circle(int x, int y, int r){
        xAxis = x;
        yAxis = y;
        Radius = r;
    }

    static class calculateArea{

        double area(Circle c){
            return 3.14 * c.Radius * c.Radius;
        }
    }

    static class calculateCircumference{

        double circumference(Circle c){
            return 2 * 3.14 * c.Radius;
        }
    }

}
