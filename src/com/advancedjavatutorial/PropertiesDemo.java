package com.advancedjavatutorial;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties capitals = new Properties();
		Set states;
		String str;
		
		capitals.put("AP", "Amaravati");
		capitals.put("tamilnadu","chennai");
		capitals.put("telangana","hyderabad");
		capitals.put("karnataka", "baglore");
		capitals.put("kerala","trivendram");
		
		states = capitals.keySet();
		Iterator itr = states.iterator();
		while(itr.hasNext()){
			str = (String) itr.next();
			System.out.println("the capital of" +str + "is" +capitals.getProperty(str)+ " .");
		}
		System.out.println();
		
		str = capitals.getProperty("mp", "not found");
		System.out.println("the capital of mp is:" +str+ "   ");
	}

}
