package _99_extra.recursion_practice;

public class RecursionMath {
	
	public static int recursionMultiplication(int number, int times) {
		//1. Create a if statement to decide weather to multiply again or to stop the cycle based on the 'times' number
		
		//2. If you keep going, return this method with times-1 + the number that was passed in
		
		//3. If you are stopping, just return 0. This will stop the cycle
		return 0;
		
	}
	
	//4. Try this one on your own! Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	public static int recursionDivision(int number, int numberToDevideBy) {
		return 0;
		
	}
	
	//5. Try this one on your own!
	public static int recursionPower(int number, int power) {
		return 0;
		
	}
	
	public static void main(String[] args) {
		System.out.println("recursionMultiplication: 5*10 = 50 " + recursionMultiplication(5, 10) + " should be 50");
		System.out.println("recursionMultiplication: 7*7 = 49 " + recursionMultiplication(7, 7) + " should be 49");
		System.out.println("recursionMultiplication: 12*45 = " + recursionMultiplication(12, 45) + " should be 540");
		System.out.println("recursionDivision: 10/5 = " + recursionDivision(10, 5) + " should be 2");
		System.out.println("recursionDivision: 70/7 = " + recursionDivision(70, 7) + " should be 10");
		System.out.println("recursionDivision: 120/6 = " + recursionDivision(120, 6) + " should be 20");
		System.out.println("recursionPower: 2⁶ = " + recursionPower(2, 6) + " should be 64");
		System.out.println("recursionPower: 3³ = " + recursionPower(3, 3) + " should be 27");
		System.out.println("recursionPower: 55⁰ = " + recursionPower(55, 0) + " should be 1");
	}
}
