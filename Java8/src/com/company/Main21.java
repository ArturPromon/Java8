package com.company;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter number of a month: ");
        int month = scn.nextInt();
        System.out.println(months[month - 1]);
    }
}
