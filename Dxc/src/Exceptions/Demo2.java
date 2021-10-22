package Exceptions;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String[] names=new String[5];
			names[6]="vamsi";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Doing arrays");
	}

}
