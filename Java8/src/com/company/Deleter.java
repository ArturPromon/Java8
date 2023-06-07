package com.company;

import java.io.File;

public class Deleter {
    public static void main(String[] args) {
        try{
            File file = new File("src/com/company/Artur.txt");
            if(file.exists()){
                System.out.println("Hello");
                if(file.delete()){
                    System.out.println("Deleted");
                }else{
                    System.out.println("Error!");
                }
            }else{
                System.out.println("Pathname is wrong!");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
