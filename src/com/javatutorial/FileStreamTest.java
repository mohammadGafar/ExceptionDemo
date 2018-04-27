package com.javatutorial;
import java.io.*;

public class FileStreamTest {

	public static void main(String[] args) {
		try{
			byte bWrite [] = {11,21,3,40,5};
			OutputStream os = new FileOutputStream("text.txt");
			for(int x=0;x<bWrite.length;x++){
				os.write(bWrite[x]);
			}
			os.close();
			
			InputStream in = new FileInputStream("text.txt");
			int size = in.available();
			
			for(int i=0;i<size;i++){
				System.out.println((char)in.read()+" ");
			}
			in.close();
		}catch(IOException e){
			System.out.println("Exception");
		}
	}

}
