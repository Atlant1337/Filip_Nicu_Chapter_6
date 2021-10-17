package com.company;
import java.util.Scanner;

public class Ex621 {
    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }
    public static void displayDigits(int n){
        int[] arr = new int[String.valueOf(n).length()];

        for(int i=arr.length-1; i>=0; i--){
            arr[i] = remainder(n, 10);
            n = quotient(n, 10);
        }
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d  ", arr[i]);
        }
        System.out.println();
    }
}

