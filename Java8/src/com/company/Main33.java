package com.company;

public class Main33 {
    public static void main(String[] args) {
        int num = 106;
        System.out.println(OddOrEven(num));
    }
    public static String OddOrEven(int num){
        String result1;
        if(num % 2 == 0){
            result1= "Even";
            return result1;
        }else{
            result1= "Odd";
            return result1;
        }
    }
}
