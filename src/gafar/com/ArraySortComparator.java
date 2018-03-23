package gafar.com;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortComparator {

	public static void main(String[] args) {
		String str[]={"java","perl","sql"};
		
		Arrays.sort(str,new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}});
		for(String str1:str){
			System.out.println(str1);
		}
			
		}
	}


