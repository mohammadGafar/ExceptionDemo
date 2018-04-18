package com.javatutorial;

public class BufferMethodsDemo {

	public static void main(String[] args) {
			
		StringBuffer sBuffer=new StringBuffer("am in buffer");
		int capacity = sBuffer.capacity();
		System.out.println("buffer capacity"+capacity);
		char charAt=sBuffer.charAt(0);
		System.out.println("char at method"+charAt);
		int indexOf=sBuffer.indexOf("buffer");
		System.out.println("beffer indexof"+indexOf);
		int indexOf1=sBuffer.indexOf(" ", 0);
		System.out.println("buffer string indexof"+indexOf1);
		int lastIndexOf=sBuffer.lastIndexOf("in ");
		System.out.println("buffer last index of "+lastIndexOf);
		int lastIndexOf1=sBuffer.lastIndexOf("in ",6);
		System.out.println("buffer last index of "+lastIndexOf1);
		int length=sBuffer.length();
		System.out.println("sbuffer length"+length);
	}

}
 