package com.company;

public class MainPolymorphism {
    public static void main(String[] args) {
//        Figure figure1 = new Circle();
//        figure1.draw();
//        Figure figure2 = new Triangle();
//        figure2.draw();
//        Figure figure3 = new Ellipse();
//        figure3.draw();
        Figure[] figures = new Figure[]{new Circle(), new Triangle(), new Ellipse()};
        for(int i = 0; i < figures.length;i++){
            figures[i].draw();
        }

        Figure obj = new Figure();
    }
}
