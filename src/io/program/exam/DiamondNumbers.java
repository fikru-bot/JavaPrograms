package io.program.exam;

import java.util.Scanner;

public class DiamondNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  
        //Taking noOfRows value from the user
  
        System.out.println("How Many Rows You Want In Your Diamond?");
  
        int noOfRows = sc.nextInt();
         
        //Getting midRow of the diamond
         
        int midRow = noOfRows/2;
  
        //Initializing row with 1
  
        int row = 1;
  
        System.out.println("Here Is Your Diamond : ");
  
        //Printing upper half of the diamond
         
        for (int i = midRow; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row
  
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
  
            //Printing row value j times at the end of each row
  
            for (int j = 1; j <= row; j++)
            {
                System.out.print(row+" ");
            }
  
            System.out.println();
  
            //Incrementing the row
  
            row++;
        }
         
        //Printing lower half of the diamond
         
        for (int i = 0; i <= midRow; i++) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" "); 
            } 
             
            //Printing row value j times at the end of each row 
             
            for (int j = row; j > 0; j--) 
            {
                System.out.print(row+" ");
            }
             
            System.out.println();
             
            //Decrementing the row
             
            row--;
        }

	}

}
