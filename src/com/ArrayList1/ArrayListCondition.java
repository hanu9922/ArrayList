package com.ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCondition {

	public static void main(String[] args) {
		 List<Integer> numbers = new ArrayList<>();
	        numbers.add(13);
	        numbers.add(18);
	        numbers.add(25);
	        numbers.add(40);

      Iterator<Integer> itr= numbers.iterator();
      while(itr.hasNext()) {
    	  int num=itr.next();
    	  if(num%2!=0) {
    	itr.remove();
    	  }
    	  else {
    		  System.out.println(num);
    	  }
      }
}}