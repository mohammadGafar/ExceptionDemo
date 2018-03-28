package com.javatutorial;

public class DogClass {
	 String breed;
	 int age;
	 String color;
	 public DogClass(String breed,int age, String color){
		this.breed=breed;
		 this.age=age;
		 this.color=color;
	 }
	 public void barck(){
		 System.out.println("dog is barking");
	 }
	 public void hungry(){
		 System.out.println("dos is hungry");
	 }
	 public void sleepin(){
		 System.out.println("dog is sleeping");
	 }
	 
	 public void display(){
		 System.out.println("breed"+" "+breed+"\n "+"age"+age+"\n "+"color"+color);
	 }
	public static void main(String[] args) {
		DogClass dc=new DogClass("daburman",5,"black");
		DogClass d=new DogClass("hutch",2,"white");
		dc.barck();
		dc.hungry();
		dc.sleepin();
		dc.display();
		d.display();
	}

}
