package io.program.exam;

import java.util.Scanner;

public class DecimalToOctal {
//Write a java program to Convert Decimal To Octal 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //Taking input from the user
         
        System.out.println("Enter The Decimal Number : ");
         
        int inputNumber = sc.nextInt();
         
        //Copying inputNumber into copyOfInputNumber
         
        int copyOfInputNumber = inputNumber;
         
        //Initializing octal to empty string
         
        String octal = "";
         
        //Defining rem to store remainder
         
        int rem = 0;
         
        //See the below explanation to know how this loop works
         
        while (inputNumber > 0)
        {
            rem = inputNumber%8;
             
            octal =  rem + octal;
             
            inputNumber = inputNumber/8;
        }
         
        System.out.println("Octal Equivalent of "+copyOfInputNumber+" is "+octal);
    }

	}


