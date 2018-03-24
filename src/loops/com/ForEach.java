package loops.com;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	
	ForEach(){
		for(int i=0;i<=10;i++){
			System.out.println(i);
			
		}
		System.out.println();
		for(int i=0;i<=10;i=i+2){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ForEach f=new ForEach();
		List<String> list= new ArrayList<>();
		list.add( "java");
		list.add("perl");
		
		for(String str:list){
			System.out.println(str);
		}
		
		
	}

}
