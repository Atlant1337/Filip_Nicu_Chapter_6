package com.company;
import java.util.Scanner;

public class Ex630 {
    public static void main(String[] args) {
        int n;
        n = (int) (Math.random() * 999 + 1);
        Scanner input = new Scanner(System.in);
        int x;
        do {
            System.out.print("Enter a guess from 1 to 1000): ");
            x = input.nextInt();
            if (x == n)
                System.out.println("Congratulations! You win!");
            else if (x < n)
                System.out.println("Your guess is smaller than the secret number...");
            else if (x > n)
                System.out.println("Your guess is greater than the secret number...");
        } while (x != n);
    }
}