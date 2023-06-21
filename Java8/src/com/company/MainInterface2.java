package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class MainInterface2 {
    public static void main(String[] args) {
        ArrayInterface2 obj = new MyInterface2();
        Scanner scn = new Scanner(System.in);
        int value;
        for(int i =0; i<MyInterface2.a.length + 1;i++){
            value= scn.nextInt();
            System.out.println(obj.Add(value));
        }
        System.out.println(Arrays.toString(obj.GetArray()));
        System.out.println(obj.GetValue(3));
    }
}
