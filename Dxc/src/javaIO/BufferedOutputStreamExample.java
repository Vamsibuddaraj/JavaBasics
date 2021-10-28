package javaIO;
import java.io.*;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout=new FileOutputStream("C:\\Users\\vamsi\\OneDrive\\Desktop\\testout.txt");
			
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			
			String s="hello guys";
			
			byte[] b=s.getBytes();
			
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
