package com.dataPackage;

public class Main {

    public static void main(String[] args) {

        //Calling Circle methods
        System.out.println();
        Circle circle = new Circle(10,20,5);
        Circle.calculateArea a = new Circle.calculateArea();
        double areaResult = a.area(circle);
        Circle.calculateCircumference c = new Circle.calculateCircumference();
        double circumferenceResult = c.circumference(circle);
        double printCircumference = Math.round(circumferenceResult);
        System.out.println("Radius = " + circle.Radius + " units " +  "Area = " +areaResult + " square units");
        System.out.println();
        System.out.println("Radius = " + circle.Radius  + " units " +  " Circumference = " + printCircumference + " circumference units" );
        System.out.println();

        //Calling PrimeNumberDecider methods
        PrimeNumberDecider decider = new PrimeNumberDecider();
        decider.insertNumber();
        decider.Output();


        //Calling the Organization methods
        Organization.Tech tech = new Organization.Tech();
        System.out.println("THE TECH DEPARTMENT ");
        tech.setdata();
        tech.getdata();
        tech.getSalary();

        Organization.Design design = new Organization.Design();
        System.out.println("THE DESIGN DEPARTMENT ");
        design.setdata();
        design.getdata();
        design.getSalary();

        Organization.HR hr = new Organization.HR();
        System.out.println("THE HR DEPARTMENT ");
        hr.setdata();
        hr.getdata();
        hr.getSalary();





    }
}
