package demo;

public class iterationAssignment3 {

	public static void main(String args[]) {

		int number = 27;
		char[] myString = Integer.toString(number).toCharArray();
		char[] newString = new char[myString.length];
		int y = 0;

		for (int i = myString.length - 1; i >= 0; i--) {

			newString[y] = myString[i];
			y++;
		}

		System.out.println(newString);
		int i = myString.length - 1;
		y = 0;
		while (i >= 0) {
			newString[y] = myString[i];
			y++;
			i--;
		}
		System.out.println(newString);

	}

}
