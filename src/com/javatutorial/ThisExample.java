package com.javatutorial;

public class ThisExample {
	int num=10;
	ThisExample(){
		System.out.println("this is an example program on this ");
	}
	ThisExample(int num){
		this();
		this.num=num;
	}
	public void greet(){
		System.out.println("welcome");
	}
	public void print(){
		int num=20;
		System.out.println("value of local variable no is:"+num);
		System.out.println("value of instance variable no is:"+this.num);
		this.greet();
	}
	public static void main(String[] args) {
		ThisExample obj=new ThisExample();
		obj.print();
		
		ThisExample obj1=new ThisExample(30);
		obj1.print();
	}

}
