package com.arrays;

import java.util.Arrays;

public class MultiDimensionArrays {

    public static void main(String[] args) {

        int mat[][] = {{3,5,1},{2,0,4},{6,9,8}};
        System.out.println();
        System.out.println(Arrays.deepToString(mat));
        System.out.println("The number at (2,1) is " + mat[2][1]);
        System.out.println();
    }
}
