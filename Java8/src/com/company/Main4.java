package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter some value: ");
        int number = scn.nextInt();
        System.out.println("Please enter some value again: ");
        int number2 = scn.nextInt();
        // > < >= <= == !=(не равно)
        if(number > 10) {
            System.out.println("Number is bigger than 10");
        }else if(number == 10){
            System.out.println("Number is 10");
        }else{
            System.out.println("Number is less than 10");
        }
        //&&и(Все условия) ||или(Хотя бы одно условие)
        if(number > 10 || number2 > 15){
            System.out.println("Hello world!");
        }else{
            System.out.println("Error");
        }
    }
}
