package com.company;
import java.util.Arrays;

public class Main14{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int num1 = 3;
        int num2 = 5;
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length;i++){
            if(array[i] == num1 || array[i] == num2){
                array[i] = 50;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
