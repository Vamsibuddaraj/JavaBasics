package Debugging;

public class Debug {
	
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		int sum=c1.add(11, 22);
		System.out.println("the sum is-"+sum);
		c1.addding();
	}
}
