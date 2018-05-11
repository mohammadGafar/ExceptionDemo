package com.advancedjavatutorial;


import java.util.*;

public class SetDemo {
	
	public static void main(String[]args){
		
		int count[] = {34,56,48,28,76,94};
		Set<Integer> set = new HashSet<>();
		try{
			for(int i=0;i<5;i++){
				set.add(count[i]);
			}
			System.out.println(set);
			
			TreeSet sortedSet = new TreeSet(set);
			System.out.println("the sorted list is");
			System.out.println(sortedSet);
			
			System.out.println("the first element of the set is:"+(Integer)sortedSet.first());
			
			System.out.println("the last element of the set is:"+(Integer)sortedSet.last());
		}catch(Exception e){}
	}
}
