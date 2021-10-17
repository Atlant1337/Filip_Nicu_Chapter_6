package com.company;
import java.util.Scanner;

public class HypotenuseTest
{
    public static void main(String[]args)
    {
        Hypotenuse x = new Hypotenuse();

        System.out.println("The hypotenuse of Triangle 1 is : "+x.Result(3.0,4.0));

        System.out.println("The hypotenuse of Triangle 2 is : "+x.Result(5.0,12.0));

        System.out.println("The hypotenuse of Triangle 3 is : "+x.Result(8.0,15.0));

    }
}