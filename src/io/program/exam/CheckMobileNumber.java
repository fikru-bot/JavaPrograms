package io.program.exam;

import java.util.Scanner;

public class CheckMobileNumber {
//Write a java program to check whether user has entered a number or not.
	static class Utility
	{
	    static boolean numberOrNot(String input)
	    {
	        try
	        {
	            Integer.parseInt(input);
	        }
	        catch(NumberFormatException ex)
	        {
	            return false;
	        }
	        return true;
	    }
	}
	public static void main(String[] args) {
		System.out.println("Enter your mobile number");
		 
        Scanner sc = new Scanner(System.in);
 
        String input = sc.next();
 
        if(Utility.numberOrNot(input) && (input.length() == 10))
        {
            System.out.println("Good!!! You have entered valid mobile number");
        }
        else
        {
            System.out.println("Sorry!!!! You have entered invalid mobile number. Try again...");
        }

	}

}