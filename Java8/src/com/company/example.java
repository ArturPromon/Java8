package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class example {
        public static void main(String[] args) {
            String[] array = {"K", "O", "Z", "Z", "G", "S", "F"};
            //OUT ["F", "S"´,"G", "Z", "Z", "O",  "K"]
            // BEZ VSPOMOGATELNOGO MASSIVA
            System.out.println(Arrays.toString(array));
//            for (int s = array.length - 1; s > 0 ; s--) {
//                System.out.print(array[s] +", ");
//            }
            String[] array2 = new String[array.length];
            int index = 0;
            for (int i = array.length-1;i >= 0; i--){
                array2[index] = array[i];
                index++;
            }
            System.out.println(Arrays.toString(array2));

    }
}
