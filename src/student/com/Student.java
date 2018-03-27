package student.com;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Student {

	int rollNo;
	String name;
	int sub1, sub2, sub3;
	int total;
	double per;
	String result;

	Student() {
		read();
		display();
	}

	public void read() {
		System.out.println("enter roll no");
		Scanner sc = new Scanner(System.in);
		rollNo = sc.nextInt();
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter sub1 marks");
		sub1 = sc.nextInt();
		System.out.println("enter sub2 marks");
		sub2 = sc.nextInt();
		System.out.println("enter sub3 marks");
		sub3 = sc.nextInt();
		calculate();
	}

	public void display() {

		System.out.println("rollno is:" + rollNo);
		System.out.println("name is" + name);
		System.out.println("sub1 marks:" + sub1);
		System.out.println("sub2 marks " + sub2);
		System.out.println("sub3 marks " + sub3);
		System.out.println("total is" + total);
		System.out.println("percentage" + per);
		System.out.println("result"+result);
		
	}

	public void calculate() {
		total = sub1 + sub2 + sub3;
		per = total / 3.0;

		if (sub1 < 35 || sub2 < 35 || sub3 < 35) {
			result = "fail";
		} else {
			if (per >= 70) {
				result = "distinction";
			}else{
				if(per>=60){
					result="first";
				}else{
					if(per>=50){
						result="second";
					}else
					{
						result="third";
					}
				}
			}
		}
	}
}
