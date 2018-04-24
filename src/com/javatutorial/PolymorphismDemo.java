package com.javatutorial;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Salary s=new Salary("samad","skht,AP",2,3600.00);
		s.mailCheck();
		Employe e=new Salary("john","hyd",3,2400.00);
		e.mailCheck();
	}

}
