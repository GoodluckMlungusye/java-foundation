package com.inheritance;

public class InheritanceOveriding {

    public static void main(String[] args) {
        class father{
            void name(){
                System.out.println("Daniel");
            }
        }

        class child extends father{
            void name(){
                System.out.println("Goodluck");
                super.name();// super keyword enable to access the method with similar name

            }
        }

        //Calling methods
        child c = new child();
        System.out.println();
        c.name();
        System.out.println();

    }
}
