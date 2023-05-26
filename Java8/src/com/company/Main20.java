package com.company;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        int num1, num2, result;
        String YesNo;
        boolean isTrue = true;
        boolean isTrue2;
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        System.out.println("This is a game!");
        while(isTrue){
            isTrue2 = true;
            System.out.println("Game rules: First number is random. Sum of two numbers must be lower 100");
            num1 = (int) Math.round(Math.random()*100);
            System.out.println("Please enter second number: ");
            num2 = scn.nextInt();
            while(isTrue2){
                if(num2<20){
                    System.out.println("Second number must be bigger than 20!!!");
                    System.out.println("Please try again: ");
                    num2 = scn.nextInt();
                }else{
                    result = num1 + num2;
                    if(result>100){
                        System.out.println("You lost the game!, because sum of two numbers was " + result);
                    }else{
                        System.out.println("You won the game!, because sum of two numbers was " + result);
                    }
                    isTrue2 = false;
                }
            }
            System.out.println("Would You want to play again? (Yes/No): ");
            YesNo = scn2.nextLine();
            while(true){
                if(YesNo.equals("Yes") || YesNo.equals("y") || YesNo.equals("yep") || YesNo.equals("yes")|| YesNo.equals("n") || YesNo.equals("no") || YesNo.equals("No")){
                    isTrue = YesNo.equalsIgnoreCase("yes");
                    break;
                }else{
                    System.out.println("Error, try again: ");
                    YesNo = scn2.nextLine();
                }
            }
        }
    }
}
