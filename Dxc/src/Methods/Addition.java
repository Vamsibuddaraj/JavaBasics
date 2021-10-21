package Methods;

import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(Adding(a,b));
		
	}
	static int Adding(int a,int b) {
		int sum = a + b;
		return sum;
	}

}
