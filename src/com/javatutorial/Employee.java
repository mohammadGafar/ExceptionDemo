package com.javatutorial;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	public Employee(String name){
		this.name=name;
	}
	
	public void setAge(int empAge){
		age=empAge;
	}
	public void setDesignation(String empDesignation){
		designation=empDesignation;
	}
	public void setSalary(double empSalary){
		salary=empSalary;
	}
	
	public void printEmploye(){
		System.out.println("Name:"+salary);
		System.out.println("Age:"+age);
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);
	}
	public static void main(String[] args) {
		Employee emp=new Employee("Ashok");
		emp.setAge(25);
		emp.setDesignation( "software");
		emp.setSalary( 35000);
		emp.printEmploye();
	}

}
