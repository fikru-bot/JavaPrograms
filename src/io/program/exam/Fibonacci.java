package io.program.exam;

import java.util.Scanner;
 // Write a Java Program for the Fibonacci series
//Fibonacci series is a series of numbers where after the initial two numbers, 
//every occurring number is the sum of two preceding numbers.
public class Fibonacci {
    public static void main(String[] args) {
        int num, a = 0,b=0, c =1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times");
        num = in.nextInt();
        System.out.println("Fibonacci Series of the number is:");
        for (int i=0; i<num; i++) {
            a = b;
            b = c;
            c = a+b;
            System.out.println(a + "");    
        }       
    }
}
