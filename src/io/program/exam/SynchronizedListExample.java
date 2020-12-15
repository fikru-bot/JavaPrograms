package io.program.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
//How do you synchronize ArrayList, HashSet and HashMap in java?
public class SynchronizedListExample {

	public static void main(String[] args) {
		//Creating non synchronized ArrayList object
        
        ArrayList<String> list = new ArrayList<String>();
         
        //Adding elements to list
         
        list.add("JAVA");
         
        list.add("STRUTS");
         
        list.add("JSP");
         
        list.add("SERVLETS");
         
        list.add("JSF");
         
        //Getting synchronized list
         
        List<String> synchronizedList = Collections.synchronizedList(list);
         
        //you must use synchronized block while iterating over synchronizedList
         
        synchronized (synchronizedList) 
        {
            Iterator<String> it = synchronizedList.iterator();
             
            while (it.hasNext()) 
            {
                System.out.println(it.next());
            }
        }
            
          //Creating non synchronized HashSet object
            
            HashSet<String> set = new HashSet<String>();
             
            //Adding elements to set
             
            set.add("JAVA");
             
            set.add("STRUTS");
             
            set.add("JSP");
             
            set.add("SERVLETS");
             
            set.add("JSF");
             
            //Getting synchronized set
             
            Set<String> synchronizedSet = Collections.synchronizedSet(set);
             
            //you must use synchronized block while iterating over synchronizedSet
             
            synchronized (synchronizedSet) 
            {
                Iterator<String> ithash = synchronizedSet.iterator();
                 
                while (ithash.hasNext()) 
                {
                    System.out.println(ithash.next());
                }

        }
          //Creating HashMap object which is not synchronized
            
            HashMap<String, Integer> map = new HashMap<String, Integer>();
             
            //Adding elements to map
             
            map.put("ONE", 1);
             
            map.put("TWO", 2);
             
            map.put("THREE", 3);
             
            map.put("FOUR", 4);
             
            map.put("FIVE", 5);
             
            //Getting synchronized map
             
            Map<String, Integer> synchronizedMap = Collections.synchronizedMap(map);
             
            Set<String> keySet = synchronizedMap.keySet();
             
            System.out.println("Keys.............");
             
            //While iterating over synchronizedMap, you must use synchronized block.
             
            synchronized (synchronizedMap) 
            {
                Iterator<String> it = keySet.iterator();
                 
                while (it.hasNext()) 
                {
                    System.out.println(it.next());
                }
            }
             
            Collection<Integer> values = synchronizedMap.values();
             
            System.out.println("Values.............");
             
            //While iterating over synchronizedMap, you must use synchronized block.
             
            synchronized (synchronizedMap) 
            {
                Iterator<Integer> it = values.iterator();
                 
                while (it.hasNext()) 
                {
                    System.out.println(it.next());
                }
            
	}}}


