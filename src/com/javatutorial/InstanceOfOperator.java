package com.javatutorial;

class A{
	
}

class B extends A{
	
}

public class InstanceOfOperator {

	public static void main(String[] args) {
		String name="vikram";
		boolean result= name instanceof String;
		System.out.println(result);
		A a=new B();
		boolean result1=a instanceof B;
		System.out.println(result1);
		
		
	}

}
