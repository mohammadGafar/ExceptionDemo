package com.javatutorial;

public class SwapExample {

	public static void main(String[] args) {
		int a=30, b=45;
		System.out.println("Before Swaping, a="+a+"and b+"+b);
		swapFunction(a,b);
		System.out.println("before and after");
		System.out.println("After swap, a="+a+"and b="+b);
	}
	public static void swapFunction(int a,int b){
		
		System.out.println("inside before swaping a="+a+"b="+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("after swaping inside a="+a+"b="+b);
	}

}
