package com.inheritance;

public class ParentChild {

    //the parent class
    static class father{

        void surname(){
            System.out.println("Daniel");
        }

    }

    // the child class which inherits the parent class
    static class child extends father{

        void name(){
            System.out.println("Goodluck");
        }

    }

}
