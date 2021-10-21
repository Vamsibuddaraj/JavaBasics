package Methods;
import java.util.*;

public class FindEvenOdd {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		OddEven(number);
	}
	static void OddEven(int number) {
		if(number%2 == 0) {
			
			System.out.println(number+" is an even number"); 
			
		}else {
			
			System.out.println(number+" is an odd number");
			
		}
	}
}
