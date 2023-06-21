package com.company;

public class MyInterface implements Print, Read {
    String mark;
    String model;

    MyInterface(){

    }
    MyInterface(String mark, String model){
        this.mark = mark;
        this.model = model;
    }
    @Override
    public void printCar() {
        System.out.println(mark + " " + model);
    }
    @Override
    public void printBike() {
        System.out.println(mark + " " + model);
    }
    @Override
    public void readCar() {
        System.out.println("Honda Civic");
    }
    @Override
    public void readBike() {
        System.out.println("Suzuki Z1");
    }
}
