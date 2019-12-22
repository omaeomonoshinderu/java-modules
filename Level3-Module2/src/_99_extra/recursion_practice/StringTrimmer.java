package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

public class StringTrimmer {
	
	static public String trimString(String str, int removesLeft) {
		//1. If there are no removes left
			//2.  return the string
		
		//3. Else you need to substring the string by 1, reduce removesLeft by 1, and then return both. 
		
		return null;
	}
	
	public static void main(String[] args) {
		assertEquals("Hello World!, 5 : ", trimString("Hello World!", 5));
		assertEquals("LeaugeOfAmazing!, 10 : ", trimString("Hello World!", 10));
		assertEquals("JamesTheIntern, 9 : ", trimString("JamesTheIntern", 9));
		assertEquals("MoreThanTheWord, 20 : ", trimString("MoreThanTheWord", 20));
	}
}
