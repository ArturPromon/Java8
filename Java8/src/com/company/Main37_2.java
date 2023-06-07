package com.company;

import java.util.Arrays;

public class Main37_2 {
    public static void main(String[] args) {
        int[] prime = new int[100];
        int n = 0;
        for(int i = 0; n < prime.length;i++){
            if(checkPrime(i)){
                prime[n] = i;
                n++;
            }
        }
        System.out.println(Arrays.toString(prime));
        int[] prime10 = new int[10];
        int k = 0;
        int num = prime[prime.length-1] * prime[prime.length-1];
        System.out.println(num);
        for(int i = num; k<prime10.length;i++){
            if(checkPrime(i)){
                prime10[k] = i;
                k++;
            }
        }
        System.out.println(Arrays.toString(prime10));
    }
    public static boolean checkPrime(int num){
        if(num<2){
            return false;
        }
        for(int j = 2; j<num;j++){
            if(num%j == 0){
                return false;
            }
        }
        return true;
    }
}
