package com.javatutorial;

public class My_Calculate extends Calculate {
	public void mutiplication(int x, int y){
		z=x*y;
		System.out.println("multiplication of given numbers:"+z);
	}
	public static void main(String[] args) {
		int a=20,b=40;
		My_Calculate demo=new My_Calculate();
		demo.addition(a, b);
		demo.substraction(a, b);
		demo.mutiplication(a,b);
	}

}
