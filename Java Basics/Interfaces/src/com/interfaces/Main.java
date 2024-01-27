package com.interfaces;

public class Main {
    public static void main(String[] args) {

        GovernmentBank governmentBank = new GovernmentBank("John");
        PrivateBank privateBank = new PrivateBank("Doe");

        governmentBank.payInterest();
        privateBank.payInterest();
    }
}
