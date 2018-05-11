package com.advancedjavatutorial;

import java.util.*;

public class SortedSetTest {

	public static void main(String[] args) {
		SortedSet set = new TreeSet();
		
		set.add('d');
		set.add('a');
		set.add('u');
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object element = it.next();
			System.out.println(element.toString());
		}
	}

}
