package com.company;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int speed = scn.nextInt();
        if(speed<50){
            System.out.println("All good");
        }else if(speed>50 && speed<60){
            System.out.println("Aiaiai");
        }else if(speed>60 && speed<71){
            System.out.println("Trahv 80eur");
        }else{
            System.out.println("Say bb to your drive licence");
        }

    }
}
