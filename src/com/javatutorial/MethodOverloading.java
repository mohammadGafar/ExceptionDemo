package com.javatutorial;

public class MethodOverloading {

	public static void main(String[] args) {
		int a=21;
		int b=20;
		double x=45;
		double y=22;
		int c=minFunction(a,b);
		double z=minFunction(x,y);
		System.out.println("interger min="+c);
		System.out.println("double min="+z);
	}
	public static int minFunction(int n1,int n2){
		int min;
		if(n1>n2)
			min=n2;
		else
			min= n1;
		
		return min;
		}
	public static double minFunction(double n1,double n2){
		double min;
		if(n1>n2)
			min=n2;
		else
			min=n1;
		return min;
		
	}

}
