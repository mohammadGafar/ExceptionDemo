package com.javatutorial;

public class InstanceCounter {
	
	private static int numInstances=0;
	protected static int getCount(){
		return numInstances;
	}
	private static void addInstances(){
		numInstances++;
	}
	InstanceCounter(){
		InstanceCounter.addInstances();
	}
	public static void main(String[] args) {
		System.out.println("strating with"+InstanceCounter.getCount()+"instances");
		for(int i=0;i<500;++i){
			new InstanceCounter();
		}
		System.out.println("created"+InstanceCounter.getCount()+"instances");
	}

}
