package Abstraction;

import org.junit.Test;

import junit.framework.TestCase;

public class BmwTest extends TestCase {
	
	@Test
	public void testAdd() {
		int expected = 30;
		int actual = BmwFlyingCar.add(10, 20);
		assertEquals(expected, actual);
	}

	@Test
	public void testElgibility() {
		boolean expected = false;
		boolean actual = BmwFlyingCar.isEligibletoVote(19);

		//assertFalse(actual);
		assertTrue(actual);
	}


}
