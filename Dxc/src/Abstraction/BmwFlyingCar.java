package Abstraction;

public class BmwFlyingCar extends FlyingCar {
	
	@Override
	public void stopCar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void flyCar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void landCar() {
		// TODO Auto-generated method stub

	}

	static int add(int x,int y) {
		int actual=x+y;
		return actual;	
	}
	
	public static boolean isEligibletoVote(int age) {
		if (age >18) {return true;}
		return false;
	}
	

}
