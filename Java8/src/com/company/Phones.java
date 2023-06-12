package com.company;

public class Phones {
    public static void main(String[] args) {
        PhonesDemo Apple  = new PhonesDemo();
        PhonesDemo Samsung = new PhonesDemo();
        PhonesDemo Nokia = new PhonesDemo("3310", 1, 30);
        PhonesDemo Xiaomi = new PhonesDemo("Z10", 64, 250);
        PhonesDemo2 Motorola = new PhonesDemo2("5555", 32, "Lollipop", "Blue", 150);
        PhonesDemo3 LG = new PhonesDemo3("Bluebird", 16, "KitKat", "Silver", 100, "Yes","No");
        PhonesDemo3 Huawei = new PhonesDemo3("true", "false");



        Apple.model = "XR";
        Apple.memory = 64;
        Apple.price = 500;
        Samsung.model = "S21";
        Samsung.memory = 128;
        Samsung.price = 1000;

        System.out.println(Apple.model + " " + Apple.memory + "GB " + Apple.price + "$");
        System.out.println(Samsung.model + " " + Samsung.memory + "GB " + Samsung.price + "$");
        System.out.println(Nokia.model + " " + Nokia.memory + "GB " + Nokia.price + "$");
        System.out.println(Xiaomi.model + " " + Xiaomi.memory + "GB " + Xiaomi.price + "$");
        System.out.println(Motorola.model + " " + Motorola.memory + "GB " + Motorola.software + " " +
        Motorola.color + " " + Motorola.price + "$");
        System.out.println(LG.model + " " + LG.memory + "GB " + LG.software + " " +
                LG.color + " " + LG.price + "$ " + "FM " + LG.FM + " SdCard " + LG.SdCard );
    }
}
