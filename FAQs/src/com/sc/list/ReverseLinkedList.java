package com.sc.list;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		

		List<?> l = new ArrayList<Number>();
		
		//List<? extends Number> l2 = new ArrayList<Number>();
		//List<? super Number> l3 = new ArrayList<Number>();
		//List<Number> l4 = new ArrayList<Number>();
		
		//l.add(11, null);
		
		l.add(new Integer(11), null);
		
		System.out.println(l.get(0));
		//A
	
	}

	
}
