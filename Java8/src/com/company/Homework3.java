package com.company;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Plese enter any date in May (1-31): ");
        int count = scn.nextInt();
        if(count==1){
            System.out.println("1 mai-Kevadpüha(vaba päev)");
        }
        if(count==9){
            System.out.println("9 mai-Euroopa päev");
        }
        if(count==14){
            System.out.println("14 mai-Emadepäev");
        }
        if(count==28){
            System.out.println("28 mai-Nelipühade 1.püha");
        }else{
            System.out.println("tavaline päev");
        }
    }
}
