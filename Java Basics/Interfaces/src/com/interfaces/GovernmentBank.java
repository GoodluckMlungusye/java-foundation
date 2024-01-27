package com.interfaces;

public class GovernmentBank implements BankRules {

    String customerName;

    GovernmentBank(String customerName){
        this.customerName = customerName;
    }

    @Override
    public void payInterest() {
        System.out.println(customerName + " is paid an interest of 5%");
    }
}
