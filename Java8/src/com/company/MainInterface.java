package com.company;

public class MainInterface {
    public static void main(String[] args) {
        Print car1 = new MyInterface("Toyota", "Auris");
        Print bike1 = new MyInterface("Yamaha", "F1");
        car1.printCar();
        bike1.printBike();
        Read car2 = new MyInterface();
        car2.readCar();
        Read bike2 = new MyInterface();
        bike2.readBike();
    }
}
