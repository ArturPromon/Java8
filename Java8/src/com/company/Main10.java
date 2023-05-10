package com.company;

public class Main10 {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 1;
        int result;
        System.out.print(num1 + " " + num2 + " ");
        for(int i = 0; i < 40; i++){
            result = num1 + num2;
            System.out.print(result + " ");
            num1 = num2;
            num2 = result;
        }
    }
}
