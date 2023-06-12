package com.company;

public class PhonesDemo3 extends PhonesDemo2 {
    String FM;
    String SdCard;

    PhonesDemo3(){

    }
    PhonesDemo3(String FM, String SdCard){
        this.FM = FM;
        this.SdCard = SdCard;
    }
    PhonesDemo3(String model,int memory, String software, String color, int price, String SdCard, String FM){
        super(model,memory,software,color,price);
        this.FM = FM;
        this.SdCard = SdCard;
    }
}

