package com.company;

import java.util.Arrays;

public class Main11 {
    public static void main(String[] args) {
        int[] array = {5,10,15,20,0,-1};
        System.out.println(array[5]);
        int[] array2 = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(array2[9]);
        System.out.println(Arrays.toString(array2));
        int[][] array3 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(array3[2][0]);

        int[] array4 = new int[5];
        array4[0] = 5;
        array4[1] = 10;
        array4[2] = 10;
        array4[3] = 10;
        array4[4] = 30;
        System.out.println(Arrays.toString(array4));
    }
}
