
public class Test {
	public static void main(String[] args){
	    if (isVacation() && isWeekend()){
	        System.out.println("Sleep in till noon");
	    }
	    System.out.print("\n");

	    if (isWeekend() && isVacation()){
	        System.out.println("Sleep in till noon");
	    }
	    System.out.print("\n");

	    if (isWeekend() || isVacation()){
	        System.out.println("No School! \"Yay!\"");
	    }
	    System.out.print("\n");
	    
	    if (isVacation() || isWeekend()){
	        System.out.println("No School! \"Yaaaaaay!\"");
	    }

	}


	private static boolean isWeekend(){
	    System.out.println("Checking if it’s a weekend \\o/...");
	    return false;
	}

	private static boolean isVacation(){
	    System.out.println("Checking if it’s a vacation day \\o/...");
	    return true;
	}


}
