package demo;

public class methodsExercise2 {

	public static boolean isLeapYear(int year) {
		// Write your logic here to complete the code
		boolean c = year%4==0;
		
		return c;
		
	}
	
	public static void main(String[] args) {
		boolean res = isLeapYear(2012);
		if (res) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}
	}
}
