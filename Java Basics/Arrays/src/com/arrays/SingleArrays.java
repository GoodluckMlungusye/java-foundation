package com.arrays;

import java.util.Arrays;

public class SingleArrays {

    public static void main(String[] args) {

        // array declaration
        int numbers[] = {4,1,6,3,9,5,2,8,0,7};
        // accessing the arrays
        System.out.println();
        System.out.println("The number at index position 4 is " + numbers[4]);
        System.out.println("The array has a length of " + numbers.length);
        Arrays.sort(numbers);
        System.out.println("The sorted array is as shown below");
        System.out.println(Arrays.toString(numbers));
        System.out.println();
    }
}
