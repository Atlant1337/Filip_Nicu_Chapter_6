package com.company;
import java.util.Scanner;

public class Ex618 {
    public static void SquareOfAsterisks (int n, char x){
        for (int i=1; i<=n;i++){
            for(int j=1; j<=n;j++)
                System.out.print(x);
            System.out.println();
        }
    }
}