package com.company;
import java.util.Scanner;

public class Ex622Test {
    public static void main(String[] args) {

        Ex622 tst = new Ex622();
        System.out.println("\nPress a number to choose\n");
        System.out.println("1. Celsius to Fahrenheit ");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("0. Exit");
        while (true) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double temp;
            switch (n) {
                case 1: {
                    System.out.print("\nInsert the temperature in Celsius: ");
                    temp = input.nextDouble();
                    System.out.printf("%.1f Celsius is %.1f in Fahrenheit", temp, tst.fahrenheit(temp));
                }
                break;
                case 2: {
                    System.out.print("\nInsert temperature in Fahrenheit: ");
                    temp = input.nextDouble();
                    System.out.printf("%.1f Fahrenheit is %.1f Celsius", temp, tst.celsius(temp));
                }
                break;
                case 0: {
                    return;
                }
            }
            System.out.println("\nPress a number to choose\n");
        }
    }
}

