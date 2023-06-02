package com.company;

import java.util.Arrays;

public class Main26 {
    public static void main(String[] args) {
        int[] array = {1,1,5,5,5,76,3,4,3,-1,1,1,-1};
//        int[] array = {1,1,1,2,2,3,3,3,4,5,5,5,0};
        Arrays.sort(array);
        int max = array[0];
        int length = 1;
        for(int i = 0; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
                length++;
            }
        }
        System.out.println(length);
        int[] array2 = new int[length];
        int index = 1;
        array2[0] = array[0];
        max = array[0];
        for(int i = 0; i<array.length;i++){
            if(max<array[i]){
                max = array[i];
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
