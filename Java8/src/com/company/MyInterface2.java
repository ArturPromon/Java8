package com.company;

public class MyInterface2 implements ArrayInterface2 {
    static int[] a = new int[5];
    int size = 0;
    @Override
    public boolean Add(int value) {
       if(size!=a.length){
           a[size] = value;
           size++;
           return true;
       }else{
           System.out.println("Daily limit is reached");
           return false;
       }
    }
    @Override
    public int[] GetArray() {
        return a;
    }
    @Override
    public int GetValue(int index) {
        return a[index];
    }
}
