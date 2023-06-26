package com.company;

class Body{
    String sedan;
    String avant;
    Door doors = new Door();
}

class Door{
    int count;
    Window windows = new Window();
}

class Window{
    public void windowsCounter(){
        System.out.println(3);
    }
}
public class CarNested {
    Body body = new Body();
    public static void main(String[] args) {
        CarNested car = new CarNested();
        car.body.doors.windows.windowsCounter();
    }
}


