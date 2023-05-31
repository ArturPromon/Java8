package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Main27 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Volvo");
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);
        cars.set(1,"Skoda");
        System.out.println(cars);
        cars.add(1,"Mazda");
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        cars.add("Audi");
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Volvo");
        System.out.println(cars.get(1));
        int size = cars.size();
        System.out.println(size);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(10);
        numbers.add(7);
        numbers.add(15);
        numbers.add(-4);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        numbers.sort(Collections.reverseOrder());
        System.out.println(numbers);
     }
}
