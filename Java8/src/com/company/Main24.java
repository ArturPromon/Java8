package com.company;

public class Main24 {
    public static void main(String[] args) {
        int[] numbers = {3,5,5,65,35,234,23,-13,42,4,2,6456,124,70};
        int max, min;
        max=min=numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]> max){
                max = numbers[i];
            }
            if(numbers[i]< min){
                min = numbers[i];
            }
        }
        System.out.println("max " + max);
        System.out.println("min " + min);
    }
}
