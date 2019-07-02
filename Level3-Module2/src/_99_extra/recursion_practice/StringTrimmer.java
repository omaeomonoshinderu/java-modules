package _99_extra.recursion_practice;

public class StringTrimmer {
	
	static public String trimString(String str, int removesLeft) {
		//1. Create an if statement to decide weather if keep the cycle going or to stop the cycle.
		
		//2. If there are no removes left or there is no string chars left, stop the cycle by just returning the string
		
		//3. Else you need to substring the string by 1, and reduce removesLeft by 1, and then return both. 
		
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!, 5 : " + trimString("Hello World!", 5));
		System.out.println("LeaugeOfAmazing!, 10 : " + trimString("Hello World!", 10));
		System.out.println("JamesTheIntern, 9 : " + trimString("JamesTheIntern", 9));
		System.out.println("MoreThanTheWord, 20 : " + trimString("MoreThanTheWord", 20));
	}
}
