package com.advancedjavatutorial;


import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("mehreen");
		l.add("ayan");
		l.add("rohan");
		l.add("mehreen");
		System.out.println("List elements");
		System.out.println("\t"+l);
		l.get(2);
		l.subList(2, 3);
		System.out.println(l.get(2));
		System.out.println(l.subList(2,3));
		String str = new String();
		
		List l1 = new LinkedList();
		l1.add("Mehreen");
		l1.add("Ayan");
		l1.add("Rohan");
		l1.add("Rohan");
		System.out.println("Linked List elements");
		System.out.println("\t"+l1);
	}

}
