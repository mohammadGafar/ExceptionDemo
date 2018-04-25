package com.javatutorial;

abstract class AnonymousInner{
	public abstract void myMethod();
}
public class Anonymous_InnerDemo {
	public static void main(String[]args){
		AnonymousInner inner=new AnonymousInner(){
			public void myMethod(){
				System.out.println("this is an example of anonymous inner class");
			}
		};
		inner.myMethod();
	}
}
