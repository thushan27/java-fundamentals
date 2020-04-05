package demo;

public class variablesAssignment7 {
	
	public static void main(String args[]) {
		
		int number = 3;
		
		if(number%3 == 0 && number%5 == 0) {
			System.out.println("Zoom");
		}
		else if(number%5 == 0) {
			System.out.println("Zap");
		}
		else if(number%3 == 0) {
			System.out.println("Zip");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
