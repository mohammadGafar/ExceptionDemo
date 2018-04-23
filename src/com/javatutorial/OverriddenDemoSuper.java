package com.javatutorial;

class Animal1{
	public void move(){
		System.out.println("Animals can move");
	}
}
class Dog1 extends Animal1{
	public void move(){
		super.move();
		System.out.println("dog can walk and run");
	}
}
public class OverriddenDemoSuper {

	public static void main(String[] args) {
		Animal1 b=new Dog1();
		b.move();
	}

}
