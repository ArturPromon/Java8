package com.company;

import java.util.Arrays;

public class Main26_3 {
    public static void main(String[] args) {
        int[] numbers = {1,1,5,3,4,2,1,6,3,3,2,2,1,2,3,4,10,3524,2,0};
        int max = numbers[0];
        int[] numbers2;
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(max< numbers[i]){
                max = numbers[i];
            }
        }
        int[] temp = new int[max + 1];
        System.out.println(Arrays.toString(temp) + "\n");
        for(int i = 0; i < numbers.length;i++){
            temp[numbers[i]]++;
            System.out.println(Arrays.toString(temp));
        }

        for(int i = 0; i <temp.length;i++){
            if(temp[i] !=0){
                
            }
        }
        numbers2 = new int[count];
        int index = 0;
        for(int i = 0; i <temp.length;i++){
            if(temp[i] !=0){
                numbers2[index] = i;
                index++;
            }
        }
        System.out.println("numbers2 " + Arrays.toString(numbers2));
    }
}
