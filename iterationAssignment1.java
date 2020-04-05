package demo;

public class iterationAssignment1 {

	public static void main(String args[]) {

		int number = 72;
		String myString = Integer.toString(number);
		String newString = "";

		for (int i = myString.length() - 1; i <= 0; i--) {

			newString += myString.charAt(i);
		}

		System.out.println(newString);
		
	}

}
