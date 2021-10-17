package com.company;
import java.util.Scanner;
import java.util.Random;

public class Ex629 {
    private static Random flip = new Random();
    private enum Coin{HEADS, TAILS};

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] flips = new int[2];
        int x = 0;

        while(true){
            System.out.println("1. Toss Coin");
            System.out.println("0. Exit");
            if(input.nextInt() == 0)
                break;
            switch(flip()){
                case HEADS:
                    flips[0] += 1;
                    break;
                case TAILS:
                    flips[1] += 1;
                    break;
                default:
                    break;
            }
            x++;
        }
        System.out.printf("\nThrows : %d \nHeads : %d \nTails: %d\n", x, flips[0], flips[1]);
    }
    public static Coin flip(){
        return (flip.nextInt(2) == 0) ? Coin.HEADS : Coin.TAILS;
    }
}
