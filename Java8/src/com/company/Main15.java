package com.company;

import java.util.Arrays;

public class Main15 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,45,3,5,3,4,2,48,9,10,20,30};
        int[] array2;
        int count = 0;
        int index = 0;
        for(int i = 0; i< array.length ; i++){
            if(i>=3 && i<array.length-3 && array[i] !=5){
                count++;
            }
//            System.out.print(array[i] + " ");
        }
        System.out.println(Arrays.toString(array));
        array2 = new int[count];
        for(int i = 0; i<array.length;i++){
            if(i>=3 && i<array.length-3 && array[i] !=5){
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
