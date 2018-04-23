package com.javatutorial;

class SuperClass{
	int age;
	SuperClass(int age){
		this.age=age;
	}
	public void getAge(){
		System.out.println("age value in super class "+age);
	}
}
public class SubClass extends SuperClass {
	SubClass(int age){
		super(age);
	}

	public static void main(String[] args) {
		SubClass s=new SubClass(24);
		s.getAge();
	}

}
