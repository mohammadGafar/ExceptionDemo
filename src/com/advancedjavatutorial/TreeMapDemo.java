package com.advancedjavatutorial;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		tm.put("guru", new Double(1000.00));
		tm.put("vijay", new Double(2000.00));
		tm.put("Aishwarya", new Double(5000.00));
		
		Set set = tm.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+" :");
			System.out.println(me.getValue());
			System.out.println();
		}
		double balance = ((Double)tm.get("guru")).doubleValue();
		tm.put("guru", new Double(balance + 1000));
		System.out.println("guru new balance:"+tm.get("guru"));
	}

}
