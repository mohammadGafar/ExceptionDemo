package com.javatutorial;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer sBuffer=new StringBuffer("AM an  ");
		sBuffer.append("Indian");
		System.out.println(sBuffer);
		sBuffer.reverse();
		System.out.println(sBuffer);
		sBuffer.delete(2, 3);
		System.out.println(sBuffer);
		sBuffer.insert( 1, "good");
		System.out.println(sBuffer);
		sBuffer.replace(3, 9, "muslim");
		System.out.println(sBuffer);
	}

}
