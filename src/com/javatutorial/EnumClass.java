package com.javatutorial;

public class EnumClass {
	enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
	FreshJuiceSize size;
	public static void main(String[] args) {
		
		
		System.out.println("juice size is:"+FreshJuiceSize.MEDIUM);
		EnumClass e=new EnumClass();
		System.out.println(("juice size is:"+FreshJuiceSize.SMALL));
		e.size=EnumClass.FreshJuiceSize.LARGE;
		System.out.println("size:"+e.size);
	}

}
