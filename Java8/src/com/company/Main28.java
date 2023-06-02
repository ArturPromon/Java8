package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter some month: ");
        String month = scn.nextLine();
        String UpMonth = month.substring(0,1).toUpperCase() + month.substring(1);
        if(Arrays.asList(months).contains(UpMonth)){
            int index = Arrays.asList(months).indexOf(UpMonth) + 1 ;
            System.out.println(index);
        }else{
            System.out.println("Error!");
        }
    }
}
