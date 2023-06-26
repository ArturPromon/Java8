package com.company;

import java.util.HashMap;

public class Main40 {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<String,String>();
        capitals.put("Estonia", "Tallinn");
        capitals.put("Latvia", "Riga");
        capitals.put("France", "Paris");
        capitals.put("Finland" , "Helsinki");
        System.out.println(capitals);
        System.out.println("Tallinn".hashCode());
        System.out.println("Riga".hashCode());
        System.out.println("Paris".hashCode());
        System.out.println("Helsinki".hashCode());

//        System.out.println(capitals.get("Latvia"));
//
//        for(String i: capitals.keySet()){
//            System.out.println(i);
//        }
//
//        for(String i: capitals.values()){
//            System.out.println(i);
//        }
////        capitals.remove("France");
////        capitals.clear();
//        System.out.println(capitals);
//
//        HashMap<String, Integer> namesage = new HashMap<>();
//        namesage.put("Bob", 55);
//        namesage.put("John", 35);
//        namesage.put("Lee", 28);
//        namesage.put("Ronnie", 12);
//        namesage.put("Mark", 19);
//
//        int sum = 0;
//
//        for(int i: namesage.values()){
//            sum+=i;
//        }
//        float avg = (float) sum /namesage.size();
//        System.out.println(avg);
//        //Создать массив в пределах от -15 до 15 и поместить туда 10 случайных значений
//        //Найти наибольшое и наименьшое значения среди этого массива
    }
}