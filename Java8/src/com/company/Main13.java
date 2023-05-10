package com.company;

public class Main13 {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10,1,3,123,4,23,4,5,5,3535};
        float result = 0;
        for(int i = 0; i< array.length; i++){
             result += array[i];
        }
        System.out.println(result);
        float average = 0;
        average = result/array.length;
        System.out.println(average);
    }
}
