package io.program.exam;

import java.util.Scanner;
/*Java program to show you how to check if a String is palindrome or not. 
* An String is said to be palindrome if it is equal to itself after reversing. 
* In this program, you will learn how to check * if a string is a palindrome in 
java using recursion * and for loop both. * * @author Javin */


/** * How to check if String is palindrome in Java * using StringBuffer and for loop. * *  */ 
public class Palindrome{ public static void main(String args[]){ 
	Scanner reader = new Scanner(System.in); 
	System.out.println("Please enter a String"); 
	String input = reader.nextLine(); 
	System.out.printf("Is %s a palindrome? : %b %n", 
		input, isPalindrome(input)); 
	System.out.println("Please enter another String"); 
	input =reader.nextLine(); 
	System.out.printf("Is %s a palindrome? : %b %n", input, 
			isPalindrome(input)); 
	reader.close(); 
	} 
public static boolean isPalindrome(String input) { 
	if (input == null || input.isEmpty()) { 
		return true; 
		} 
	char[] array = input.toCharArray(); 
				StringBuilder sb = new StringBuilder(input.length()); 
				for (int i = input.length() - 1; i >= 0; i--) {
					sb.append(array[i]); 
					} 
				String reverseOfString = sb.toString(); 
				return input.equals(reverseOfString); } }

