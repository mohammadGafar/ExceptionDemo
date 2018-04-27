package com.javatutorial;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {

	public static void main(String[] args) throws IOException {
		InputStreamReader cin = null;
		try{
			cin = new InputStreamReader(System.in);
			System.out.println("enter character 'q' to Quit");
			char c;
			do{
				c = (char) cin.read();
				System.out.println(c);
			}while(c != 'q');
		}finally{
			if(cin !=null){
				cin.close();
			}
		}
	}

}
