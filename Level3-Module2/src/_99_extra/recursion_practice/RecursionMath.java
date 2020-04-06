package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {
	
	public static int recursiveMultiplication(int number, int times) {
		//2. if times is 1 
			//3. return number 
		
		//4. else return number + recursionMultiplication(number, times-1)
		
		return 0;
	}
	
	//6. Try this one on your own! 
	//Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	public static int recursiveDivision(int number, int numberToDevideBy) {
		return 0;
		
	}
	
	//8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		return 0;
		
	}
	
	
	
	@Test
	void testMultiplication() {
		assertEquals(12, recursiveMultiplication(3, 4));
		//1  Add more JUnit tests like the one above to test your method
		
	}
	
	
	@Test
	void testDivision() {
		//5  Add JUnit tests to test your method
		
	}
	
	
	@Test 
	void testPower() {
		//7  Add JUnit tests to test your method
	
	}
	
}
