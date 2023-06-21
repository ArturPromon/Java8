package com.company;

public class MyCountries implements Capitals{
    String country;

    MyCountries(){

    }

    MyCountries(String country){
        this.country = country;
    }

    @Override
    public void capital(String capital) {
        System.out.println("The capital of " + country + " is " + capital);
    }
}
