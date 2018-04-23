package com.javatutorial;

class Super_Class{
	int num=20;
	public void display(){
		System.out.println("this is in the super class method");
	}
}
public class Sub_Class extends Super_Class{
	 int num=10;
	 public void display(){
		 System.out.println("this is in the sub class methid");
	 }
	 
	 public void my_method(){
		 Sub_Class sub=new Sub_Class();
		 sub.display();
		 super.display();
		 
		 System.out.println("value of num in sub class "+sub.num);
		 System.out.println("value of num in super class "+super.num);
	 }
	public static void main(String[] args) {
		Sub_Class obj=new Sub_Class();
		obj.my_method();
	}

}
