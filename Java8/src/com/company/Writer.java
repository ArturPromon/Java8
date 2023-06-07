package com.company;

import java.io.File;
import java.io.PrintWriter;

public class Writer {
    public static void main(String[] args) {
        try{
         File file = new File("test.txt");
             if(!file.exists()){
                 file.createNewFile();
             }
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello World!");
            pw.println("Hello World!");
            pw.println("Hello World!");
            pw.close();
        }catch (Exception e){
            System.out.println("Error " + e);
        }
    }
}
