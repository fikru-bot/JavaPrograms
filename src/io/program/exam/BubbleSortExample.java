package io.program.exam;
//How to implement Bubble Sort in Java?
//In Bubble sort algorithm, an array is traversed. 
//It starts from the first element and traverses until the last element. 
//The current element is compared with the next element and if the current 
//element is greater than the next element, it is swapped. 
//This process goes on until the whole array is sorted. 

public class BubbleSortExample {
	 static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){ if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                           
	                 }  
	         }  
	   
	    }  

	public static void main(String[] args) {
		int arr[] ={5,76,65,23,42,15};  
        
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
           
        bubbleSort(arr);//sorting array elements using bubble sort  
          
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

	}

}
