package com.collections;

import java.util.ArrayList;

public class Practise1 {

    public void foodItems(){

        ArrayList<String> food = new ArrayList<String>();

        food.add("Fish");
        food.add("Ugali");
        food.add("Rice");
        food.add("Chicken");
        food.add("Banana");
        food.add("Avocado");

        for(String i:food){
            System.out.println(i);
        }

    }


}
