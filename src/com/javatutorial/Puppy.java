package com.javatutorial;

public class Puppy {
	int puppyAge;
	
	public Puppy(String name){
		System.out.println("name is:"+name);
	}
	
	public void setAge(int age){
		puppyAge=age;
	}
	public int getAge(){
		System.out.println("tomy age:"+puppyAge);
		return puppyAge;	
	}
	
	public static void main(String[] args) {
		Puppy p=new Puppy("tomy");
		p.setAge(6);
		p.getAge();
		System.out.println("puppy age:::"+p.puppyAge);
		//System.out.println("puppy age is:"+Puppy.getAge());
	}

}
