package com.company;

enum Levels{
    Easy,
    Medium,
    Hard,
    Prof
}
public class Main41 {
    public static void main(String[] args) {
        Levels obj = Levels.Easy;
        switch (obj) {
            case Hard -> System.out.println("Hard");
            case Prof -> System.out.println("Prof");
            case Easy -> System.out.println("Easy");
            case Medium -> System.out.println("Medium");
        }
    }
}
