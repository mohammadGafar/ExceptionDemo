package com.javatutorial;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat dt=new SimpleDateFormat(" E yyyy.mm.dd 'at' hh:mm:ss a");
		System.out.println("current date:"+dt.format(date));
		
		String str=String.format("Current Date/Time: %tc",date);
		System.out.println(str);
	}

}
