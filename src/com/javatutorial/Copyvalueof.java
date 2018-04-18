package com.javatutorial;

public class Copyvalueof {

	public static void main(String[] args) {
		char[] str={'h','e','l','l','o'};
		String str1=" ";
		str1=str1.copyValueOf( str);
		System.out.println(str1);
		
		str1=str1.copyValueOf(str, 2,3);
		System.out.println(str1);
		
		//Stringendswith:
		
		String str2=new String("this is really good");
		boolean retval;
		
		retval=str2.endsWith("good");
		System.out.println(retval);
		
		retval=str2.endsWith("bad");
		System.out.println(retval);
	}

}
