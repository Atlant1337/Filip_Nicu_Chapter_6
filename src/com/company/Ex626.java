package com.company;
import java.util.Scanner;

public class Ex626{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you want to reverse : ");
        int nr = input.nextInt();
        int res = reverse(nr);
        System.out.println("The reversed number is " + res);
    }
    public static int reverse(int n) {
        int res = 0;
        int t;
        while (n > 0) {
            t = n % 10;
            n = n / 10;
            res = res * 10 + t;
        }
        return res;
    }
}