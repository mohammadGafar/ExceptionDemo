package com.javatutorial;

public   class Employ {
	private String name;
	private String address;
	private int number;
	 public Employ(String name,String address,int number){
		 System.out.println("Employ constructor");
		 this.name=name;
		 this.address=address;
		 this.number=number;
	 }
	 public double computePay(){
		 System.out.println("inside employ compute pay");
		 return 0.0;
	 }
	 public void mailCheck(){
		 System.out.println("mailing a check to:"+this.name+" "+this.address+" "+number);
	 }
	 public String toString(){
		 return name+" "+address+" "+number;
	 }
	 public String getName(){
		 return name;
	 }
	 public String getAddress(){
		 return address;
	 }
	 public void setAddress(String newAddress){
		 address=newAddress;
	 }
	 public int getNumber(){
		 return number;
	 }
}
