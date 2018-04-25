package com.javatutorial;

public class Static_NestedClass_Demo {
	static class Nested{
		public void method(){
			System.out.println("this is static nested class");
		}
	}
	public static void main(String[] args) {
		Static_NestedClass_Demo.Nested obj=new Static_NestedClass_Demo.Nested();
		obj.method();
	}

}
