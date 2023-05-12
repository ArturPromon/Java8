package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a length for array: ");
        int length = scn.nextInt();
        int count = 0;
        int index = 0;
        int[] array = new int[length];
        for(int i = 0; i< length; i++){
            System.out.print("array[" + i + "] = ");
            array[i] = scn.nextInt();
            if(array[i] >= 65){
                count++;
            }
        }
        int[] array2 = new int[count];
        for(int i = 0; i < array.length; i++){
            if(array[i] >=65){
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}