package demo;

//Assignments - Inheritance and Polymorphism page 7

class Employee2 {

	private int point;

	public int getPoint() {
		return this.point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}

class PerformanceRating extends Employee2 {

	private static int outstanding = 5;
	private static int good = 4;
	private static int average = 3;
	private static int poor = 2;

	public static int calculatePerformance(Employee2 employee) {

		int rating = 0;

		if (employee.getPoint() > 100) {
			System.out.println("Invalid point");
		} else if (employee.getPoint() <= 100 && employee.getPoint() >= 80) {
			rating = PerformanceRating.outstanding;
		} else if (employee.getPoint() < 80 && employee.getPoint() >= 60) {
			rating = PerformanceRating.good;
		} else if (employee.getPoint() < 60 && employee.getPoint() >= 50) {
			rating = PerformanceRating.average;
		} else if (employee.getPoint() < 50) {
			rating = PerformanceRating.poor;
		}

		return rating;

	}

}

public class InheritanceAssignment7 {

	public static void main(String args[]) {

		Employee2 employee1 = new Employee2();
		employee1.setPoint(80);

		Employee2 employee2 = new Employee2();
		employee2.setPoint(35);

		Employee2 employee3 = new Employee2();
		employee3.setPoint(101);

		System.out.println(PerformanceRating.calculatePerformance(employee1));
		System.out.println(PerformanceRating.calculatePerformance(employee2));
		PerformanceRating.calculatePerformance(employee3);

	}

}
