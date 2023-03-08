package com.ArrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSortingAndReverse {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("HANUMANT");
		list.add("ARTI");
		list.add("HARSHALI");
		list.add("BHARTI");
        Collections.sort(list);   ///Alphabetically order
       // System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        
//        Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	for(String i:list) {
		System.out.println(i);
	}
	}

}
