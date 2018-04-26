package com.javatutorial;

import java.io.FileReader;
import java.io.IOException;

public class TryDemo {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("E://file.txt")){
			char[] a = new char[50];
			fr.read(a);
			for(char c:a){
				System.out.println(c);
			}
				
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

}
