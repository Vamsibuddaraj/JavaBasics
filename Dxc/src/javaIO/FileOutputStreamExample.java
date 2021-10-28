package javaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {


		try {
			FileOutputStream fout=new FileOutputStream("C:\\Users\\vamsi\\OneDrive\\Desktop\\testout.txt");
			fout.write(65);
			fout.write(97);
			fout.close();
			System.out.println("sucess..");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
