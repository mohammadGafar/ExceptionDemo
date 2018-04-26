package com.javatutorial;

public class ExceptionwithFinally {

	public static void main(String[] args) {
		int a[] = new int[2];
		try{
			System.out.println("Access element three:"+a[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception thrown:"+e);
		}
		finally{
			System.out.println("Firest element value:"+a[0]);
			System.out.println("the finally block executed");
		}
	}

}
