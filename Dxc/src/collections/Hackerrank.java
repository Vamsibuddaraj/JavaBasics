package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Hackerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> numbers=new ArrayList<>();
		Scanner input=new Scanner(System.in);
		System.out.println("how many line are storing");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
			ArrayList<Integer> number=new ArrayList();
			System.out.println("how many values");
			int d=input.nextInt();
			for(int j=1;j<=d;j++) {
				number.add(input.nextInt());
			}
			numbers.add(number);
		}
		System.out.println("enter a query");
		int q=input.nextInt();
		for(int i=1;i<=q;i++) {
			int x=input.nextInt();
			int y=input.nextInt();
			try {
				System.out.println(numbers.get(x-1).get(y-1));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("error");
			}
		}
		
	}

}
