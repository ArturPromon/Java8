package com.company;

import java.util.Arrays;

public class Main26_2 {
    public static void main(String[] args) {
        int[] array = {1,1,5,5,5,76,3,4,3,-1,1,1,-1};
        Arrays.sort(array);
        int someValue = array[0];
        System.out.print(array[0] + " ");
        for(int i = 0; i < array.length; i++){
            if(someValue !=array[i]){
                someValue = array[i];
                System.out.print(someValue + " ");

            }
        }
    }
}
