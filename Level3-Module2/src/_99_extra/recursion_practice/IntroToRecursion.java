package _99_extra.recursion_practice;

public class IntroToRecursion {
	
	/*
	 * Recursion Basics:
	 * Recursion is a method calling it self over and over instead of using loops.
	 * The cycle starts when the method is originally called.
	 * 
	 * 	countDown(5);
	 * 
	 * This method, in its return statement then calls its self again restarting the cycle.
	 * 
	 * 	return countDown(5-1); ---> countDown(4);
	 * 
	 * The full cycle of countDown(5);
	 * 	return countDown(4) ▼
	 * 		return countDown(3) ▼
	 * 			return countDown(2) ▼
	 * 				return countDown(1) ▼
	 * 					return countDown(0) ▼
	 * 						return 0; The cycle ends here because the original method isn't called again.
	 */
	
	public static int countDown(int num) {
		System.out.println("Count Down: " + num);
		if(num <= 0) { //Checks if the num passed in is zero.
			System.out.println("STOP!");
			return 0; //Breaks the recursion by returning 0 instead of the method. Called the base case.
		} else {
			return countDown(num-1); //When num != 0 the method calls its self but passes in a value that is 1 less.
		}
	}
	
	public static void main(String[] args) {
		countDown(20);
	}
}
