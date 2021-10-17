package com.company;
import java.util.Scanner;

public class Ex616Test
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        Ex616 test = new Ex616();

        int nr1;
        int nr2;
        int tst;

        System.out.print( "Enter number of pairs to test: " );
        tst = input.nextInt();
        System.out.println();

        for ( int i = 1; i <= tst; i++ )
        {
            System.out.print( "Enter first integer: " );
            nr1 = input.nextInt();
            System.out.print( "Enter second integer: " );
            nr2 = input.nextInt();

            if ( test.isMultiple( nr1, nr2) == true )
                System.out.printf( "%d is a multiple of %d\n\n", nr2, nr1);
            else
                System.out.printf( "%d is not a multiple of %d\n\n", nr2, nr1);
        }
    }
}
