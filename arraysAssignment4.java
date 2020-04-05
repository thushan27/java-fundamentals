package demo;

public class arraysAssignment4 {

	public static int adjacentCheck(int[] numArray) {

		int count = 0;

		for (int i = 0; i < numArray.length - 1; i++) {

			if (numArray[i] == numArray[i + 1]) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

	public static void main(String args[]) {

		int[] newArray = { 1, 1, 5, 100, -20, -20, 6, 0, 0 };
		adjacentCheck(newArray);
		int[] newArray2 = { 10, 20, 30, 40, 30, 20 };
		adjacentCheck(newArray2);
		int[] newArray3 = { 1, 2, 2, 3, 4, 4, 4, 10 };
		adjacentCheck(newArray3);

	}

}
