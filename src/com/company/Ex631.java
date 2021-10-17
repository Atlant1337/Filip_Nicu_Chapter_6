package com.company;
import java.util.Scanner;

public class Ex631 {
    public static void main(String[] args) {
        int n;
        n = (int) (Math.random() * 999 + 1);
        Scanner input = new Scanner(System.in);
        int x;
        int attempts = 0;
        System.out.println(n);
        do {
            System.out.print("Enter a guess from 1 to 1000): ");
            x = input.nextInt();
            if (x != n) {
                attempts++;
                if (x < n)
                    System.out.println("Your guess is smaller than the secret number...");
                else if (x > n)
                    System.out.println("Your guess is greater than the secret number...");
            }
                if (x == n) {
                    System.out.println("Congratulations! You win!");
                    if (attempts < 10)
                        System.out.println("Either you know the secret or you got lucky! ");
                    else if (attempts == 10)
                        System.out.println("Aha! You know the secret!");
                    else if (attempts > 10);
                    System.out.println("You should be able to do better!");
                }
                if (x != n) {
                    attempts++;
                }
            }
        while (x != n) ;
    }
}
