package com.ArrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCompare2arrays {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        Collections.sort(c1);
        System.out.println(c1);
       // List<String> sub_List = c1.subList(0, 3);
        System.out.println(c1.subList(0, 3));
        //System.out.println(Collections.sort(c1));
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        c2.remove(0);
     System.out.println(c2);
     Collections.swap(c2,0,1);
     System.out.println(c2);


     
//        System.out.println(b);
//       }
      
	}

}
