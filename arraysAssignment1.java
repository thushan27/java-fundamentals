package demo;

public class arraysAssignment1 {

	public static void main(String args[]) {

		int[] score = { 281, 344, 265, 272, 236, 324, 287 };

		int totalScore = 0;
		int countBelow = 0;
		int countAverage = 0;
		int countAbove = 0;

		for (int eachScore : score) {
			totalScore += eachScore;
		}

		int averageScore = totalScore / 7;

		System.out.println("The average score of the team is " + averageScore + " runs");

		for (int eachScore : score) {
			if (eachScore > averageScore) {
				countAbove += 1;
			} else if (eachScore == averageScore) {
				countAverage += 1;
			} else if (eachScore < averageScore) {
				countBelow += 1;
			}
		}
		System.out.println("Number of cricket scores above average: " + countAbove);
		System.out.println("Number of cricket scores equal to average: " + countAverage);
		System.out.println("Number of cricket scores below average: " + countBelow);

	}
}