package com.company;

import java.util.Scanner;

public class Main38 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write which exchange you want to see ( number1 - from euro to dollar, number2 - from dollar to euro, number3 - from euro to ruble, number4 - from ruble to euro)");
        int number;
        number = scn.nextInt();
        boolean isTrue = true;
        while (isTrue) {
            if (number >4) {
                System.out.println("Please try again");
                number = scn.nextInt();
            } else {
                isTrue = false;
            }
        }
        System.out.println("How much do you want to change?");
        float number2;
        number2 = scn.nextFloat();

        switch (number) {
            case 1 -> change1(number2);
            case 2 -> change2(number2);
            case 3 -> change3(number2);
            case 4 -> change4(number2);
        }
    }
    public static void change1(float number2){
        System.out.println(number2 * 1.0611);
    }
    public static void change2(float number2){
        System.out.println(number2 * 1.106);
    }
    public static void change3(float number2){
        System.out.println(number2 * 78.0189 + " rub");
    }
    public static void change4(float number2){
        System.out.println(number2 * 91.636);
    }
}
