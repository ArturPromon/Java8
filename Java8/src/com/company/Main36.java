package com.company;

public class Main36 {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 20;
        float a1 = 5.5f;
        float b1 = 2.5f;
        System.out.println(sum(a,b));
        System.out.println(sum());
        System.out.println(sum(a1,b1));
        System.out.println(sum(a,false));
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(){
        int a, b;
        a = 10;
        b = 20;
        int result = a+b;
        return result;
    }
    public static float sum(float a1, float b1){
        return a1 + b1;
    }

    public static int sum(int a, boolean isTrue){
        if(isTrue){
            a = a*a*a;
            return a;
        }else{
            a = a*a;
            return a;
        }
    }
}
