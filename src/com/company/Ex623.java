package com.company;
import java.util.Scanner;

public class Ex623 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 numbers : ");
        System.out.printf("Minimum value is : %f\n",minumum3(input.nextDouble(), input.nextDouble(), input.nextDouble()));
    }
    public static double minumum3(double x, double y, double z){
        return Math.min(x, Math.min(y, z));
    }
}