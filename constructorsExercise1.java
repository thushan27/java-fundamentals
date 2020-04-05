package demo;

class Circle {
	private double radius;
	private double pi;
	private double area;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public void displayArea() {
		area = pi * radius * radius;
		System.out.println(area);
	}
}

public class constructorsExercise1 {
	public static void main(String args[]) {
		Circle newCircle = new Circle();
		newCircle.displayArea();
		newCircle.setPi(3.14);
		newCircle.setRadius(3);
		newCircle.displayArea();
	}

}
