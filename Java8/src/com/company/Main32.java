package com.company;

public class Main32 {
    public static int function(){
        int num1,num2,num3;
        num1 = 10;
        num2 = 20;
        num3 = sum(num1,num2);
        return num3;
    }
    public static int sum(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(function());
    }
}
