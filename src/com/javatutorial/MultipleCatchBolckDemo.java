package com.javatutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleCatchBolckDemo {

	public static void main(String[] args) {
		try{
			String fileName;
			FileInputStream file = new FileInputStream(fileName);
			byte x = (byte)file.read();
		}catch(IOException i){
			i.printStackTrace();
			
		}catch(FileNotFoundException f){  //not valid
			f.printStackTrace();
		
		}
	}

}
