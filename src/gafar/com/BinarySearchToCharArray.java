package gafar.com;

import java.util.Arrays;

public class BinarySearchToCharArray {

	public static void main(String[] args) {
		char chrArray[]={'a','s','d','f','v'};
		int index= Arrays.binarySearch(chrArray,0,chrArray.length-1,'v');
		System.out.println("search v in Array"+index);
	}

}
