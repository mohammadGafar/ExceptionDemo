package com.advancedjavatutorial;

import java.util.*;

public class CollectionsDemoList {

	public static void main(String[] args) {
		List a1 = new ArrayList();
		a1.add("zara");
		a1.add("mahnaz");
		a1.add("samad");
		System.out.println("Array list elements");
		System.out.println("\t"+a1);
		
		List l1 = new LinkedList();
		l1.add("zara");
		l1.add("mehnaz");
		l1.add("samad");
		System.out.println("Linked list elements");
		System.out.println("\t"+l1);
		
		
		Set s1 = new HashSet();
		s1.add("zara");
		s1.add("mehnaz");
		s1.add("samad");
		System.out.println("hashset elements");
		System.out.println("\t"+s1);
		
		Map m1 = new HashMap();
		m1.put("zara",8);
		m1.put("mehnaz",23);
		m1.put("samad",45);
		System.out.println("map values with key");
		System.out.println("\t"+m1);
		
	}

}
