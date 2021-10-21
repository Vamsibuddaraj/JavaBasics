package Ecommerce;

public class TestShopping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerAbdul=new Customer();
		customerAbdul.walkin();
		Security maxSecurity=new Security();
		boolean isCustomer=maxSecurity.scan(customerAbdul);
		if(isCustomer) {
			customerAbdul.shop();
			
		}
		customerAbdul.checkout();

	}
}
