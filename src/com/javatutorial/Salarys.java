package com.javatutorial;

public class Salarys extends Employ {
	private double salary;
	public Salarys(String name,String address,int number,double salary){
		super(name,address,number);
		setSalary(salary);
	}
	public void mailCheck(){
		System.out.println("within mail check of salary class:");
		System.out.println("mailing check to "+getName()+"with salary"+salary);
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double newSalary){
		if(newSalary>=0.0){
			salary=newSalary;
		}
	}
	public double computePay(){
		System.out.println("computing salary pay for"+getName());
		return salary/52;
	}
}
