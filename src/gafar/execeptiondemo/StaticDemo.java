package gafar.execeptiondemo;
 
   

import java.util.ArrayList;
import java.util.List;

public class StaticDemo {

	public static List<String> list;

	static {
			list=new ArrayList<String>();
			list.add("one");
			list.add("two");
			list.add("three");
		}

	public void displayList() {
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo sd = new StaticDemo();
		sd.displayList();
	}

}
