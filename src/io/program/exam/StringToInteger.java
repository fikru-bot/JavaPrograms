package io.program.exam;

public class StringToInteger {
//Java Program To Convert String To Integer
	public static void main(String[] args) {
		//Using Integer.parseInt() method
		String s = "2015";
        
        int i = Integer.parseInt(s);
         
        System.out.println(i);  
        

        //Using Integer.valueOf() method
        String l = "2015";
         
        int r = Integer.valueOf(l);
         
        System.out.println(r);  

	}

}
