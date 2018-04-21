package com.javatutorial;

import java.lang.reflect.Array;

public class PassingArrayToMethid {
	
	public static void printArray(double[] array){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		double[] array= new double[10];
		printArray(new double[]{1,2,4,5});
		for(double element: array){
			System.out.println(element);
		}
	}
	

}
