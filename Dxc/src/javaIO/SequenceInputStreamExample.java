package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream input1=new FileInputStream("C:\\Users\\vamsi\\OneDrive\\Desktop\\testout.txt");
			FileInputStream input2=new FileInputStream("C:\\Users\\vamsi\\OneDrive\\Documents\\today.txt");
			
			SequenceInputStream inst=new SequenceInputStream(input1, input2);
			
			int j;
			while((j=inst.read())!=-1) {
				System.out.print((char)j);
			}
			inst.close();
			input1.close();
			input2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
