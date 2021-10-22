package Exceptions;

public class Demo {
	public static void main(String[] args) {
		try {
			int i=100/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Printing the rest of the code");
	}
}
