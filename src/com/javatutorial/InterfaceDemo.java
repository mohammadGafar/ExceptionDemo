package com.javatutorial;

interface AnimalZ{
	public void eat();
	public void travel();
}
public class InterfaceDemo implements AnimalZ {
	public void eat(){
		System.out.println("mamals eats");
	}
	public void travel(){
		System.out.println("mamals travel");
	}
	public int noOfLegs(){
		return 0;
	}
	public static void main(String[] args) {
		InterfaceDemo id=new InterfaceDemo();
		id.eat();
		id.travel();
	}

}
