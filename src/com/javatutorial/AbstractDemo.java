package com.javatutorial;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Salarys s=new Salarys("manni","chennai",4,5200.00);
		s.mailCheck();
		Employ e=new Salarys("george","london",24,5400.00);
		e.mailCheck();
	}

}
