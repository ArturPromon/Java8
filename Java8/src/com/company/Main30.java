package com.company;

public class Main30 {
    public static void main(String[] args) {
        try{
            int[] num = {1,2,3,4,5};
            System.out.println(num[4]);
//            int num2 = 5/0;
        }catch (Exception e){
            System.out.println("Error" + e);
        }finally {
            System.out.println("Hello");
        }



    }
}
