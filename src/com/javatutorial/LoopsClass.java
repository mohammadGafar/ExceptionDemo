package com.javatutorial;

public class LoopsClass {

	public static void main(String[] args) {
		int a=10,b=10;
		int numbers[]={10,20,30,40,50,60,70,80,90};
		String names[]={"akil","nag","charry"};
		while(a<20){
			System.out.print(a);
			System.out.print("\n");
			a++;
		}
		do{
			System.out.println(b);
			b++;
		}while(b<10);
	
	for(int i=0;i<5;i++){
		System.out.println(i);
	}
	for(int x:numbers){
		if(x==50){
			break;
		}
		System.out.println(x);
	}
	for(int y:numbers){
		if(y==30){
			continue;
		}
		System.out.println(y);
	}
	for(String name:names){
		System.out.println(name);
	}
	}
}
