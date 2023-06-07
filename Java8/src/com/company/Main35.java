package com.company;

import java.util.Arrays;

public class Main35 {
    public static void main(String[] args) {
        int [] array = {3,5,456,34,24,65,12,12,5,2341,2315};
        int[] arrayMaxMin = GetMaxAndMinValueFromArray(array);
        System.out.println(Arrays.toString(arrayMaxMin));
        int max = arrayMaxMin[0];
        int min = arrayMaxMin[1];
        System.out.println("Min value from array is " + min + "\n" + "Max value from array is " + max);

    }
    public static int[] GetMaxAndMinValueFromArray(int[] array){
        int max, min;
        max=min=array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i]> max){
                max = array[i];
            }
            if(array[i]< min){
                min = array[i];
            }
        }
        int[] arrayMaxMin = new int[2];
        arrayMaxMin[0] = max;
        arrayMaxMin[1] = min;
        return arrayMaxMin;
    }

    
}
