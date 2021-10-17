package com.company;
import java.util.Scanner;

public class Ex618Test {
    public static void main(String[] args) {
        System.out.print("Enter the size : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Ex618 tst = new Ex618();
        tst.SquareOfAsterisks(n,'*');
    }
}