package com.company;
import java.util.Scanner;
public class Ex620Test
{
    public static void main(String[] args)
    {
        double z, x;

        Ex620 tst = new Ex620();
        System.out.println("Enter radius : ");

        Scanner scan = new Scanner(System.in);
        z = scan.nextDouble();
        x = tst.circleArea(z);

        System.out.println("Area of the circle is : " + x);
    }
}