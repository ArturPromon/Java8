package com.company;

public class Main22 {
    public static void main(String[] args) {
        String someString = "Last Christmas I gave you my heart But the very next day you gave it away";
        char someChar = 'a';
        int count = 0;
        for(int i = 0; i < someString.length(); i++){
            if(someString.charAt(i) == someChar){
                count++;
            }
        }
        System.out.println(count);
    }
}
