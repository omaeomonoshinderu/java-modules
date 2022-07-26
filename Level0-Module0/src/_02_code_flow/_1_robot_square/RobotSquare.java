package _02_code_flow._1_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */
// This recipe draws a square using the Robot

public class RobotSquare {

	
    public static void main(String[] args){
    	MyNumber num = new MyNumber(5);
    	KEVIN: updateInteger(num);
    	BOB: System.out.println("num outside "+ num.value);
    	POP: for(int i = 0; i<10; i++) {
    		
    	}
    }
    
    public static int updateInteger(MyNumber num) throw Exception {
    	num.value++;
    	System.out.println("num in method " + num.value);
    	throw new Exception();
    }
}

class MyNumber {
	int value;
	
	MyNumber(int value){
		this.value = value;
	}
}
