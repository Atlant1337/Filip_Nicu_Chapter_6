package com.company;
import java.util.Scanner;

public class Ex621Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        Ex621 tst = new Ex621();

        double Q = tst.quotient(a, b);
        double R = tst.remainder(a, b);

        System.out.print("Task A\n");
        System.out.println("Quotient is: " + Q);
        System.out.print("\nTask B\n");
        System.out.println("Remainder is: " + R);

        Scanner dig = new Scanner(System.in);
        System.out.print("\nEnter an integer between 1 and 99999 : ");
        tst.displayDigits(dig.nextInt());
    }
}