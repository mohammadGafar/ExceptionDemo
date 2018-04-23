package com.javatutorial;

class Animals{
	public void move(){
		System.out.println("Animals can move");
	}
}
class Dogs extends Animals{
	public void move(){
		System.out.println("Dog can walk and run");
	}
}
public class OverriddingDemo {

	public static void main(String[] args) {
		Animals a=new Animals();
		Animals b=new Dogs();
		a.move();
		b.move();
	}

}
