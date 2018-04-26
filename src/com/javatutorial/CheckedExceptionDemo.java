package com.javatutorial;
import java.io.File;
import java.io.FileReader;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		File file=new File("E:\\Browsing data");
		FileReader fr=new FileReader(file);
	}

}
