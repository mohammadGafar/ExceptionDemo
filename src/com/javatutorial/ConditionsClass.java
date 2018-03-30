package com.javatutorial;

public class ConditionsClass {

	public static void main(String[] args) {
		int x=30;
		int y=40;
		if(x==10){
			System.out.println("x value is :"+x);
		}else if(x==20){
			System.out.println("x value is :"+x);
		}else if(x==30){
			System.out.println("x value is :"+x);
		}else
		{
			System.out.println("x value is :"+x);
		}
	if(x==30){
		if(y==40){
			System.out.println(+x+" x value and y value"+y);
			
		}
	}
	char grade='C';
	switch(grade){
	case 'A':
		System.out.println("excellent");
		break;
	case 'B':
		System.out.println("well done");
		break;
	case 'C':
		System.out.println("you passed");
		break;
	default:
		System.out.println("fail");
	}
	System.out.println("your grade is:"+grade);
}
}
