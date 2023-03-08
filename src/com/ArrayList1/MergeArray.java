package com.ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;

public class MergeArray {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);  //0th index
        al.add(20);  //1th index
        al.add(30);   //2nd index
        
        ArrayList<Integer> al1=new ArrayList<Integer>(); 
        al1.add(40);  //0th index
        al1.add(50);  //1th index
        al1.add(60);   //2nd index
        al.addAll(al1);
        System.out.println(al);
        
        //By using Iterator interface
        Iterator<Integer> itr=al.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        	
        }
        
        
        //by usin For each Loop
      for(int i:al) {
  	   System.out.println(i);
      }
      
      for(int i=0;i<=5;i++) {
    	  System.out.println(i);
      }
   	   
      }
}


