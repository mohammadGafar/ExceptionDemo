package com.javatutorial;

public class StringConcatContentEquals {

	public static void main(String[] args) {
		// concat:
		String name= "who is this";
		name=name.concat("may i know your name");
		System.out.println(name);
		
		//contentEquals:
		String str1="apple";
		String str2=new String("apple");
		String str3=new String("banana");
		
		boolean result=str1.contentEquals(str2);
		System.out.println(result);
		
		boolean result1=str1.contentEquals(str3);
		System.out.println(result1);
		
	}

}
