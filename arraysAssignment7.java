package demo;

public class arraysAssignment7 {

	public static int findOccurences(String word, char letter) {

		int count = 0;

		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == letter) {

				count += 1;

			}

		}
		return count;
	}

	public static void main(String args[]) {
		System.out.println(findOccurences("optimism", 'i'));
		System.out.println(findOccurences("Foundation", 'o'));
		System.out.println(findOccurences("Sweetest", 's'));
		System.out.println(findOccurences("Relaxation", 's'));

	}
}
