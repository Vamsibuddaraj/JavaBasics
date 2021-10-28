package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\vamsi\\OneDrive\\Desktop\\testout.txt");
			int i=0;
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
