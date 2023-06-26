package com.company;

public class Final_Static {
    public static void main(String[] args) {
        System.out.println(Final_Static_Demo.a);
        Final_Static_Demo.say();
        Final_Static_Demo.a = 20;
        System.out.println(Final_Static_Demo.a);
        Final_Static_Demo b = new Final_Static_Demo();
        b.b = 25;
        System.out.println(b.b);
        Final_Static_Demo c = new Final_Static_Demo();
        System.out.println(c.b);
        Final_Static_Demo.say2();


    }
}
