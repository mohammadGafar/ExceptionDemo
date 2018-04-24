package com.javatutorial;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setName("rambo");
		e.setAge(24);
		e.setId("1245");
		
		System.out.println("id:"+e.getId()+"name:"+e.getName()+"age:"+e.getAge());
	}

}
