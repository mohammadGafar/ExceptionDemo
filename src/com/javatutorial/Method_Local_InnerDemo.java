package com.javatutorial;

public class Method_Local_InnerDemo {
	void my_Method(){
		int num=20;
		class MethodInner_Demo{
			public void print(){
				System.out.println("this is the method local inner class "+num);
			}
		}
		MethodInner_Demo inner=new MethodInner_Demo();
		inner.print();
		
	}
	public static void main(String[] args) {
		Method_Local_InnerDemo out=new Method_Local_InnerDemo();
		out.my_Method();
	}

}
