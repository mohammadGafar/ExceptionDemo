package com.javatutorial;

public class Test {
	private static double salary=258437;
	public static final String DEPARTMENT="department";
	public void narrowing(){
		System.out.println(salary);
		
	}
	public void empAge(){
		int age=0;
		age=age+7;
		System.out.println(age);
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.empAge();
		t.narrowing();
		System.out.println(DEPARTMENT+"AVG SALARY IS:"+salary);
	}

}
