package io.program.exam;
//Write a java program to check whether one string is a rotation of anothe?
public class StringRotation {

	public static void main(String[] args) {
		String s1 = "JavaJ2eeStrutsHibernate";
		 
        String s2 = "StrutsHibernateJavaJ2ee";
 
        //Step 1
 
        if(s1.length() != s2.length())
        {
            System.out.println("s2 is not rotated version of s1");
        }
        else
        {
            //Step 2
 
            String s3 = s1 + s1;
 
            //Step 3
 
            if(s3.contains(s2))
            {
                System.out.println("s2 is a rotated version of s1");
            }
            else
            {
                System.out.println("s2 is not rotated version of s1");
            }
        }

	}

}
