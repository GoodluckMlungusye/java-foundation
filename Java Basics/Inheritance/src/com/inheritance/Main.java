package com.inheritance;

public class Main {
    public static void main(String[] args) {

        ParentChild.child c = new ParentChild.child();
        System.out.println();
        c.name();// the own child method
        c.surname();//we call out the method inherited
        System.out.println();

    }
}
