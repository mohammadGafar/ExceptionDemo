package com.advancedjavatutorial;

import java.util.*;

public class EnumerationInterfaceDemo {

	public static void main(String[] args) {
		
		Enumeration months;
		Vector monthNames = new Vector();
		monthNames.add("January");
		monthNames.add("Febrauray");
		monthNames.add("March");
		monthNames.add("April");
		monthNames.add("May");
		monthNames.add("June");
		monthNames.add("July");
		monthNames.add("August");
		monthNames.add("September");
		monthNames.add("October");
		monthNames.add("November");
		monthNames.add("December");
		months = monthNames.elements();
		while(months.hasMoreElements()){
			System.out.println(months.nextElement());
		}
		
	}

}
