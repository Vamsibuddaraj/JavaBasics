package Exceptions;

public class ThrowKeyword {

	void Validate(int age) {
		if(age<18) {
			throw new ArithmeticException("person is not eligible to vote");
		}
		else {
			System.out.println("person is eligible to vote");
		}
	}
}


