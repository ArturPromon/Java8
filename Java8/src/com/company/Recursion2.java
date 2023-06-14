package com.company;

public class Recursion2 {
    public static void main(String[] args){
        rec1(15,0);
    }

    public static void rec1(int num, int num2){
        rec2(num, num2);
    }

    public static void rec2(int num, int num2){
        if(num>0){
            num-=2;
            num2+=3;
            rec1(num,num2);
        }else{
            System.out.println(num2);
//            rec2(10,0);
        }
    }
}
