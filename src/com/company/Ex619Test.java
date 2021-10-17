package com.company;
import java.util.Scanner;

public class Ex619Test {
    public static void main(String[] args) {
        System.out.print("Enter the size : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("Enter the character : ");
        char fillCharacter = input.next().charAt(0);
        Ex618 tst = new Ex618();
        tst.SquareOfAsterisks(n,fillCharacter);
    }
}