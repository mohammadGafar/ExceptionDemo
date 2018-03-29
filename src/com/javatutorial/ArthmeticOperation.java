package com.javatutorial;

public class ArthmeticOperation {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=2;
		int d=3;
		System.out.println("a+b is :"+(a+b));
		System.out.println("a-b is :"+(a-b));
		System.out.println("a*b is :"+(a*b));
		System.out.println("a/b is :"+(a/b));
		System.out.println("d%c is :"+(d%c));
		System.out.println("increment"+(a++));
		System.out.println("increament"+(++a));
		System.out.println("decrement"+(a--));
		System.out.println("decrement"+(--a));
		//relational :
		System.out.println("a equals to b"+(a==b));
		System.out.println("a not equals to b"+(a!=b));
		System.out.println("a greaterthan b"+(a>b));
		System.out.println("a less than b"+(a<b));
		System.out.println("a is g e b"+(a>=b));
		System.out.println("a less e b"+(a<=b));
		//Bitwise :
		c=a&b; 
		System.out.println("a&b is :"+c);
		c=a|b;
		System.out.println("a|b is :"+c);
		c=a^b;
		System.out.println("a^b is "+c);
		c=~b;
		System.out.println("a~b is :"+c);
		c=a>>2; 
		System.out.println("a>>2 is :"+c);
		c=d<<2;
		System.out.println("d<<2 is :"+c);
		c=b>>>2;
		System.out.println("b>>>2 is :"+c);
		boolean a1 = true; 	
		boolean b1=false;
		System.out.println(""+(a1&&b1));
		System.out.println(""+(a1||b1));
	}

}
