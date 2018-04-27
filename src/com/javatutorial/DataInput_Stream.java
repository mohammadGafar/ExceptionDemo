package com.javatutorial;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInput_Stream {

	public static void main(String[] args)throws IOException {
		DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("E:\\file.txt"));
		dataOut.writeUTF("hello world");
		
		DataInputStream dataIn = new DataInputStream(new FileInputStream("E:\\file.txt"));
		
		while(dataIn.available()>0){
			String k = dataIn.readUTF();
			System.out.println(k+" ");
		}
	}
}


