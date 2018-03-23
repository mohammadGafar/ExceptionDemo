package gafar.com;

import java.util.Arrays;

public class ArrayFill {

	public static void main(String[] args) {
		String str[]=new String[10];
		Arrays.fill(str,"Assigned");
		for(String strg:str){
			System.out.println(strg);
		}
		
	}

}
