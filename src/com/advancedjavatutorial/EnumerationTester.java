package com.advancedjavatutorial;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {

	public static void main(String[] args) {
		Enumeration days;
		Vector dayNames = new Vector();
		dayNames.add("sunday");
		dayNames.add("monday");
		dayNames.add("tuesday");
		dayNames.add("wednesday");
		dayNames.add("thrusday");
		dayNames.add("friday");
		dayNames.add("saturday");
		days = dayNames.elements();
		while(days.hasMoreElements()){
		System.out.println(days.nextElement());	
		}
	}

}
