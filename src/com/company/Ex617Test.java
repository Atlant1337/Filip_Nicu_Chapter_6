package com.company;
import java.util.Scanner;

public class Ex617Test
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Ex617 tst = new Ex617();
        System.out.print("Enter a number: ");
        while (input.hasNext())
        {
            int n = input.nextInt();
            if (tst.isEven(n))
                System.out.printf("%d is even\n", n);
            else
                System.out.printf("%d is odd\n", n);
        }
    }
}
