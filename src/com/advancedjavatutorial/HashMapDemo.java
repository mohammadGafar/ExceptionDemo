package com.advancedjavatutorial;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("samad", new Double(4562.00));
		hm.put("gafar" ,new Double(5891.10));
		hm.put("mahesh", new Double(789.12));
		hm.put("rahul", new Double(41235.12));
		
		Set set =  hm.entrySet();
		
		Iterator i = set.iterator();
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
			System.out.println();
		}
		System.out.println();
		double balance = ((Double)hm.get("rahul")).doubleValue();
		hm.put("rahul", new Double(balance + 2000));
		System.out.println("rahul's new bal:"+hm.get("rahul"));
	}

}
