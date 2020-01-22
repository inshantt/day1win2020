package com.lambton;



public class FirstExample
{
    public static void main(String[] args)
    {
       System.out.println("Welcome to JAVA Programing");

       for(int i = 1; i <= 10; i++)
           System.out.println("inshant");

       //DAY - 2 Code Starts here

        int a = 100;
        int b;

        b = 200;

        int c = a + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        short x = 1000;
        System.out.println("Short MAX = " +Short.MAX_VALUE);
        System.out.print("Short MIN =" +Short.MIN_VALUE);

        double f1 = 1000.500;
        double f2 = 1000.400;
        System.out.println("F1 = " + f1);
        System.out.println("F2 = " + f2);

        int r1 = 10 / 3;
        float r2 = 10.0f/ 3;

        System.out.println("R1 =" + r1);
        System.out.println("R2 =" +r2 );

        double  x1 = 1_00___00.5_0;
        System.out.println("X1 =" + x1);


    }
}

