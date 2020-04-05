package demo;

public class arraysAssignment8 {

	public static void elementSearch(String[] wordArray, String elementSearched) {

		int count = 0;

		for (String eachElement : wordArray) {

			if (eachElement == elementSearched) {
				count++;
				System.out.println("The string is found");
			}
		}

		if (count == 0) {
			System.out.println("The string is not found");
		}

	}

	public static void main(String args[]) {
		String[] newArray = { "Monday", "Sunday", "Tuesday" };
		elementSearch(newArray, "Sunday");
		String[] newArray2 = { "Red", "Blue", "Green", "White" };
		elementSearch(newArray2, "Pink");
		String[] newArray3 = { "Ruby", "Pearl", "Emerald", "Sapphire" };
		elementSearch(newArray3, "Pearl");
	}

}
