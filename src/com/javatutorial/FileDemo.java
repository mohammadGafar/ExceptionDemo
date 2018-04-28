package com.javatutorial;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File f = null;
		String[] str = {"text1.txt","text2.txt"};
		try{
			for(String s:str){
				f=new File(s);
				boolean bool = f.canExecute();
				String a = f.getAbsolutePath();
				System.out.println(a);
				System.out.println("is executable:"+bool);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
