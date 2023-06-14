package com.company;

public class CarEngine extends CarDemo{
    public String fuelType;
    public int power;
    CarEngine(){

    }
    CarEngine(String mark, String model, String color, int price, String fuelType, int power){
        super(mark, model, color, price);
        this.fuelType = fuelType;
        this.power = power;
    }
}
