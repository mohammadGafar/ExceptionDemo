package com.javatutorial;

class Outer{
	private int num=175;
	public class Inner_Demo{
		public int getNum(){
			System.out.println("this is getnum method of inner class");
			return num;
		}
	}
}
public class InnerClassDemo2 {

	public static void main(String[] args) {
		Outer out=new Outer();
		Outer.Inner_Demo inner=out.new Inner_Demo();
		System.out.println(inner.getNum());
	}

}
