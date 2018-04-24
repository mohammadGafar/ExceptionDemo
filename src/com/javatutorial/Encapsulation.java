package com.javatutorial;

public class Encapsulation {
	private String name;
	private String id;
	private int age;
	
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public void setAge(int newAge){
		age=newAge;
	}
	public void setName(String newName){
		name=newName;
	}
	public void setId(String newId){
		id=newId;
	}

}
