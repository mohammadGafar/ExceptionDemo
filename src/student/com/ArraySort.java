package student.com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		String name[]={"nani","charan","banny"};
		for(int i=0;i<name.length;i++){
			System.out.println(i+"  "+name[i]);
		}
		Arrays.sort( name);
		for(int i=0;i<name.length;i++){
			System.out.println(i+"  "+name[i]);
		}
	}

}
