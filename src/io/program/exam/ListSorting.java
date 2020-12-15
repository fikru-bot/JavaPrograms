package io.program.exam;

import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {

	public static void main(String[] args) {
		//Creating an ArrayList of strings
        
        ArrayList<String> list = new ArrayList<String>();
         
        //Adding elements to list
         
        list.add("Virat");
         
        list.add("rohit");
         
        list.add("Shikar");
         
        list.add("ashwin");
         
        list.add("ravindra");
         
        list.add("Bhargav");
         
        System.out.println("ArrayList Before Sorting :");
         
        System.out.println(list);
         
        //Sorting the list
         
        Collections.sort(list);
         
        System.out.println("ArrayList After Sorting :");
         
        System.out.println(list);
    }   

	}


