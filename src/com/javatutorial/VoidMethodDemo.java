package com.javatutorial;

public class VoidMethodDemo {

	public static void main(String[] args) {
		methodRankPoint(225.7);
	}
public static void methodRankPoint(double points){
	if(points >= 202.5){
		System.out.println("Rank at: A1");
	}else if(points >= 122.4){
		System.out.println("Rank at: A2");
	}
	else{
		System.out.println("Rank at: A3");
	}
}
}
