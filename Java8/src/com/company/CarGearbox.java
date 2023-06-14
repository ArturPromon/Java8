package com.company;

public class CarGearbox extends CarEngine {
    public String gearboxType;

    CarGearbox(){

    }
    CarGearbox(String mark, String model, String color, int price, String fuelType, int power, String gearboxType){
        super(mark, model, color, price, fuelType, power);
        this.gearboxType = gearboxType;
    }
}
