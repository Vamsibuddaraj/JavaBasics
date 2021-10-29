package generics;

public class DemoAccount {

	public static void main(String[] args) {
		
		Account<Integer> banumber=new Account<>();
		banumber.setObj(123456789);
		System.out.println("bank account num is "+banumber.getObj());
		
		
		Account<Double> gpay=new Account<>();
		gpay.setObj(3.14);
		System.out.println("gpay num is "+gpay.getObj());

	}

}
