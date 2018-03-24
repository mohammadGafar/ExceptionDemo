package gafar.execeptiondemo;

public class MaxMinValues {

	public static void main(String[] args) {
		
		String str="456";
		Integer it=Integer.valueOf(str);
		System.out.println(it);
		System.out.println("maximum value"+Integer.MAX_VALUE);
		System.out.println("minimum value"+Integer.MIN_VALUE);
		System.out.println("size integer"+Integer.SIZE);
		
		String st="776";
		Integer i=Integer.parseInt(st);
		System.out.println(st);
		String st1="-567";
		i=Integer.parseInt(st1);
		System.out.println(st1);
	}

}
