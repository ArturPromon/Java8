package com.company;

public class Homework1 {
    public static void main(String[] args) {
        // EVEN 2 4 6 8 10 12 ... 50
        // ODD 1 3 5 7 9 11 ... 49
        System.out.print("EVEN" + " ");
        for (int i = 2; i <= 50; i += 2){
            System.out.print(i + " " );
        }
        System.out.print("\n" + "ODD" + " ");
        for(int i = 1; i<= 49; i+=2){
            System.out.print(i + " ");
        }
    }
}
