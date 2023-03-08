package com.ArrayList1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Empoyee2 {

	public static void main(String[] args) {

		Employee E1=new Employee(101,"Nandini","pune");
		Employee E2=new Employee(102,"Ram","pune");
		Employee E3=new Employee(101,"Hanumant","pune");
		
		
		ArrayList<Employee> al=new ArrayList<Employee>();
			al.add(E1);
			al.add(E2);
			al.add(E3);
			 Iterator itr=al.iterator();  
			  //traversing elements of ArrayList object  
			  while(itr.hasNext()){  
				  Employee Emp=(Employee)itr.next();  
				  System.out.println(Emp.Id+" "+Emp.Name+" "+Emp.City);
				  
			  }  
			
           
	}

}
