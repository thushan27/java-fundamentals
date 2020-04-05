package demo;

public class arraysAssignment6 {

	public static int findFactorial(int number) {

		int factorial = 1;

		if (number == 0) {
			factorial = 1;
		} else {
			for (int i = number; i >= 1; i--) {
				factorial *= i;
			}
		}
		return factorial;

	}

	public static int findStrongNumbers(int num) {

		int sum = 0;
		char[] newElement = Integer.toString(num).toCharArray();
		for (int i = 0; i < newElement.length; i++) {

			sum = sum + findFactorial(Character.getNumericValue(newElement[i]));
			System.out.println(sum);
		}
		if (sum == num) {
			System.out.println("This number is strong.");
			return num;
		}
		return sum;
	}

	public static void main(String args[]) {

		System.out.println(findStrongNumbers(145));

	}
}