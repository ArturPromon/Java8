package com.company;

public class Car {
    public static void main(String[] args) {
        CarDemo car1 = new CarDemo("Toyota", "Corolla", "Black", 21000);
        CarGearbox car2 = new CarGearbox("BMW", "x7", "White", 90000, "Gasoline", 250, "Automatic");

        System.out.println(car1.mark + " " + car1.model + " " + car1.color + " " + car1.price );
        System.out.println(car2.mark + " " + car2.model + " " + car2.color + " " + car2.price + " " + car2.power + " " + car2.fuelType + " " +car2.gearboxType);
    }
}
