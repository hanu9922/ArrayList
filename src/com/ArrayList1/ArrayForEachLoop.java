package com.ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayForEachLoop {

	public static void main(String[] args) {
		
		//creat a ArrayString list
		ArrayList<String> al=new ArrayList<String>();
		al.add("BANANA");
		al.add("ORANGE");
		al.add("APPLE");
		System.out.println(al);
		
		;//getting the Iterator  
		Iterator itr=al.iterator();
		//check if iterator has the elements  
   while(itr.hasNext()) 
   {
	   System.out.println(itr.next()); //printing the element and move to next 
   
	}
 //for each loop traversing
//    for(String i:al) {
//    	System.out.println(i);
//    }
}
}