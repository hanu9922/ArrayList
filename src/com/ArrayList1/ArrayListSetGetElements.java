package com.ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListSetGetElements {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("HANUMANT");
		list.add("ARTI");
		list.add("HARSHALI");
		list.add("BHARTI");
		System.out.println("getting Element=="+list.get(1));
		list.set(3, "SEETA");
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
