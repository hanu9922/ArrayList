package com.ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrintVertical {
public static void main(String[] args) {
	   ///Creating Integer Arraylist
		ArrayList<Integer> al=new ArrayList<Integer>();
		  
		  al.add(10);
		  al.add(20);
		  al.add(30);
		   System.out.println(al);  //Printing the arraylist object   
		  
		//Traversing list through Iterator 
		  Iterator<Integer> itr=al.iterator();
	        while(itr.hasNext()){
	        	System.out.println(itr.next());  
	        }
	      //for each loop traversing
		  for(int i:al) {
			  System.out.println(i);
		  }
		///Creating Arraylist
		  ArrayList<String> al1=new  ArrayList<String>();
		  al1.add("Hanumant");
		  al1.add("Ram");
		  al1.add("Sheeta");
		  System.out.println(al1);   //Printing the arraylist object   
		  
		//Traversing list through Iterator 
		  Iterator itr1=al1.iterator();
		  while(itr1.hasNext()){
	        	System.out.println(itr1.next());
	        }
		  //for each loop traversing
		  for(String i:al1) {
			  System.out.println(i);
		  }
	}

	
}
