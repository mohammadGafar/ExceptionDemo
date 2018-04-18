package com.javatutorial;

public class StringEquals {
 public static void main(String[]args){
	 String str="welcome to java";
	 String str1=str;
	 String str2=new String("welcome to my world");
	 boolean retval;
	 
	 retval=str.equals(str1);
	 System.out.println(retval);
	 
	 retval=str.equals(str2);
	 System.out.println(retval);
	 
	 //equalsIgnoreCase:
	 String st="welcome To Java";
	 String st1=new String("welcome to java");
	 boolean val;
	 val=st.equalsIgnoreCase(st1);
	 System.out.println(val);
 }
}
