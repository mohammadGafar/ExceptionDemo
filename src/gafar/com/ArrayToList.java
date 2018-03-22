package gafar.com;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		String strArray[]={"java","c","c++","perl","photon"};
		List<String> list = Arrays.asList(strArray);
		System.out.println("created list size"+list.size());
		System.out.println(list);
		

	}

}
