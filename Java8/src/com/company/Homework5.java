package com.company;
public class Homework5 {
    public static void main(String[] args) {
        String str = "Hello   gtg  fge  ";
        //Вывести индекс последней буквы
        int length = str.length();
        int index = length - 1;
        while(true){
            if(str.charAt(index) == ' '){
                index--;
            }else{
                System.out.println(index);
                break;
            }
        }
    }
}