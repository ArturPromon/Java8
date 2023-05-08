package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1, num2, result;
        char sym;
        System.out.println("Please enter first number: ");
        num1 = scn.nextInt();
        System.out.println("Please enter an operation(+,-,*,/): ");
        sym = scn.next().charAt(0);
        while(true){
            if(sym != '+' && sym != '-' && sym != '*' && sym != '/'){
                System.out.println("Incorrect operation! Please try again(+, -, *, /): ");
                sym = scn.next().charAt(0);
            }else{
                System.out.println("Please enter second number: ");
                num2 = scn.nextInt();
                switch (sym) {
                    case '+':
                        result = num1 + num2;
                        System.out.println(result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println(result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println(result);
                        break;
                    case '/':
                        result = num1 / num2;
                        System.out.println(result);
                        break;
                }
                break;
            }
        }
    }
}
