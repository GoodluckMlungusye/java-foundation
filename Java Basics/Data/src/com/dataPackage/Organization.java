package com.dataPackage;

import java.util.Scanner;

public class Organization {

    static class employee{
        int employeeID;
        String Name;
        int age;



        void setdata(){
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter your surname: ");
            Name = scanner.next();
            System.out.print("Enter the ID number:");
            employeeID = scanner.nextInt();
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

        }
        void getdata(){
            System.out.println();
            System.out.println("Surname: " + Name);
            System.out.println("ID number " + employeeID);
            System.out.println("Age: " + age);


        }

    }
    static class Tech extends employee{

        int wagePerHour;
        int hoursWorked;

        void getSalary(){

            Scanner scanner = new Scanner(System.in);

            System.out.println();
            System.out.print("Enter the wage per hour paid: ");
            wagePerHour = scanner.nextInt();
            System.out.print("Enter the hours worked: ");
            hoursWorked = scanner.nextInt();
            System.out.println("Total wage: " + wagePerHour * hoursWorked + " $");
            System.out.println();
        }
    }
    static class Design extends employee{
        int wagePerWeek;
        int weeksWorked;

        void getSalary(){

            Scanner scanner = new Scanner(System.in);

            System.out.println();
            System.out.print("Enter the wage per week paid: ");
            wagePerWeek = scanner.nextInt();
            System.out.print("Enter the weeks worked: ");
            weeksWorked = scanner.nextInt();
            System.out.println("Total wage: " + wagePerWeek * weeksWorked + " $");
            System.out.println();
        }

    }

    static class HR extends employee{
        int wagePerMonth;
        int monthWorked;

        void getSalary(){

            Scanner scanner = new Scanner(System.in);

            System.out.println();
            System.out.print("Enter the wage per month paid: ");
            wagePerMonth = scanner.nextInt();
            System.out.print("Enter the months worked: ");
            monthWorked = scanner.nextInt();
            System.out.println("Total wage: " + wagePerMonth * monthWorked + " $");
            System.out.println();
        }

    }
}
