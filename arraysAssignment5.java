package demo;

public class arraysAssignment5 {

	public static boolean isLeapYear(int year) {

		return year % 4 == 0;

	}

	public static int getLeapYearCounter(int[] numArray) {

		int counter = 0;
		for (int i = 0; i < numArray.length; i++) {

			if (isLeapYear(numArray[i])) {
				counter++;
			}
		}
		return counter;
	}

	public static int[] findLeapYearList(int[] yearArray) {

		int[] leapYearList = new int[getLeapYearCounter(yearArray)];
		int y = 0;
		for (int i = 0; i < yearArray.length; i++) {

			if (isLeapYear(yearArray[i]) && y <= leapYearList.length - 1) {
				leapYearList[y] = yearArray[i];
				y++;
			}
		}
		return leapYearList;
	}

	public static void main(String args[]) {
		
		int[] newArray = {2000,2009,2014};
		
		newArray = findLeapYearList(newArray);
		
		for (int eachElement : newArray) {
			System.out.println(eachElement);
		}
		
	}

}
