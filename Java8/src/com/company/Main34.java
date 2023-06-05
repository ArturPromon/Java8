package com.company;

public class Main34 {
    public static void main(String[] args) {
        int [] array = {3,5,456,34,24,65,12,12,5,2341,2315};
        int max = GetMaxValueFromArray(array);
        int min = GetMinValueFromArray(array);
        System.out.println("Max value " + max);
        System.out.println("Min value " + min);
    }
    public static int GetMaxValueFromArray(int[] array){
        int max;
        max=array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i]> max){
                max = array[i];
            }
        }
        return max;
    }
    public static int GetMinValueFromArray(int[] array){
        int min;
        min=array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i]< min){
                min = array[i];
            }
        }
        return min;
    }
}
