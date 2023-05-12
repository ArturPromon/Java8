package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        System.out.println("Please enter a length for array: ");
        int length = scn.nextInt();
        String[] array = new String[length];
        for(int i = 0; i< length; i++){
            System.out.print("array[" + i + "] = ");
            array[i] = scn2.nextLine();
        }
        System.out.println(Arrays.toString(array));
    }
}
