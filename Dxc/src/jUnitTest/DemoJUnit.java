package jUnitTest;

import org.junit.Test;

import junit.framework.TestCase;

public class DemoJUnit extends TestCase {
	@Test
	public void testmaxNum() {
		assertEquals(4, Array.maxNum(new int[] {1,2,3,4}));
	}


}
	

class Array{

	public static int maxNum(int[] numbers) {
		int max=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(max<numbers[i]) {
				max=numbers[i];
			}


		}
		return max;
	}
	
}
