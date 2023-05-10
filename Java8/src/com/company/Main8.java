package com.company;

public class Main8 {
    public static void main(String[] args){
        int i = 0;
        while(true){
            System.out.println("Hello");
            i++;
            if(i>5){
                break;
            }
        }
        System.out.println();
        int j = 0;
        boolean isTrue = true;
        while(isTrue){
            System.out.println("Hello");
            if(j>5){
                isTrue = false;
            }
            j++;
        }
        int k = 0;
        while(k<3){
            System.out.println("World");
            k++;
        }
    }
}
