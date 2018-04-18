package com.javatutorial;

public class StringCompareTo {

	public static void main(String[] args) {
		String str1 ="String";
		String str2=new String("String");
		String str3 = new String("Integer");
		
		int result= str1.compareTo(str2);
		System.out.println(result);
		
		int result1 =str2.compareTo(str3);
		System.out.println(result1);
		
		int result2 =str3.compareTo(str1);
		System.out.println(result2);
		
		int output=str1.compareToIgnoreCase(str2);
		System.out.println(output);
		
		int output1=str2.compareToIgnoreCase(str3);
		System.out.println(output1);
		
		int output2=str3.compareToIgnoreCase(str1);
		System.out.println(output2);
	}

}
