package com.company;

public class PhonesDemo2 {
    int price;
    int memory;
    String model;
    String color;
    String software;

    PhonesDemo2(){

    }
    PhonesDemo2(String model, int memory, String software, String color, int price){
        this.model = model;
        this.memory = memory;
        this.price = price;
        this.software = software;
        this.color = color;
    }
}
