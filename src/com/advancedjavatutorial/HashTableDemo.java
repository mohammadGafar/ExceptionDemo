package com.advancedjavatutorial;

import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable balance = new Hashtable();
		Enumeration names;
		String str;
		double bal;
		
		balance.put("zara", new Double(3432.52));
		balance.put("mahnaz", new Double(5245.12));
		balance.put("ayan", new Double(5555.000));
		balance.put("daisy", new Double(4578.879) );
		
		names = balance.keys();
		while(names.hasMoreElements()){
			str = (String)names.nextElement();
			System.out.println(str +" :" +balance.get(str));
		}
		
		System.out.println();
		bal = ((Double)balance.get("zara")).doubleValue();
		balance.put("zara",new Double(bal+1000));
		
		System.out.println("zara's new lalance:"+balance.get("zara"));
	}

}
