package com.interfaces;

public class PrivateBank implements BankRules{

    String customerName;

    PrivateBank(String customerName){
        this.customerName = customerName;
    }

    @Override
    public void payInterest() {
        System.out.println(customerName + " is paid an interest of 7%");
    }
}
