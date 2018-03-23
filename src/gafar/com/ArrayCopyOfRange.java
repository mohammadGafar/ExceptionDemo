package gafar.com;

import java.util.Arrays;

public class ArrayCopyOfRange {

	public static void main(String[] args) {
		int array[]={3,5,8,6,9,2,1,0};
		for(int num:array){
			System.out.print(num+" ");
		}
			System.out.println("new array");
			int newArray[]=Arrays.copyOfRange(array, 3, 6);
			for(int numb:newArray){
				System.out.print(numb+" ");
			}
		}
	}


