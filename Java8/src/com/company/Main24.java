package com.company;

public class Main24 {
    public static void main(String[] args) {
        int max = 0;
        int[] numbers = {3,5,5,65,35,234,23,42,4,6456,124,70};
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]> max){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}