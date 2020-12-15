package io.program.exam;

import java.util.Scanner;

public class RemoveWhiteSpaces {
//Write a java program to remove white spaces from string
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter input string to be cleaned from white spaces...!");
         
        String inputString = sc.nextLine();
         
        String stringWithoutSpaces = inputString.replaceAll("\s+", "");
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
         
        sc.close();
    }

	}


