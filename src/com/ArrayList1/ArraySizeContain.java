package com.ArrayList1;

import java.util.ArrayList;

public class ArraySizeContain {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(2,75);
		System.out.println("size list is ="+al.size());
		for(int i:al) {
			System.out.println(" list ="+i);
		}
		System.out.println(" list ="+al);
		for(int i:al) {
			System.out.println(" list ="+i);
		}
		System.out.println(al.contains(80));
		System.out.println(al.contains(50));
	}

}
