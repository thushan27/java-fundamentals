package demo;

public class arraysAssignment3 {

	public static int getEvenCounter(int[] numArray) {

		int counter = 0;
		for (int i = 0; i < numArray.length; i++) {

			if (numArray[i] % 2 == 0) {
				counter++;
			}
		}
		return counter;
	}

	public static int[] findEvenArray(int[] numArray) {
		int[] evenNumberArray = new int[getEvenCounter(numArray)];
		int y = 0;
		for (int i = 0; i < numArray.length; i++) {

			if (numArray[i] % 2 == 0 && y <= evenNumberArray.length - 1) {
				evenNumberArray[y] = numArray[i];
				y++;
			}
		}
		return evenNumberArray;
	}

	public static void main(String args[]) {

		int[] array = { 14, 37, 10, 100, 21 };
		array = findEvenArray(array);
		for(int eachElement: array) {
			System.out.println(eachElement + '\n');
		}
	}

}
