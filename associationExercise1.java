package demo;

class CabService {

	private String name;
	private int totalNumberOfCars;
	private int numberOfCarsBooked;
	private int price;

	CabService(String name, int totalNumberOfCars, int numberOfCarsBooked, int price) {
		this.name = name;
		this.totalNumberOfCars = totalNumberOfCars;
		this.numberOfCarsBooked = numberOfCarsBooked;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalNumberOfCars() {
		return totalNumberOfCars;
	}

	public void setTotalNumberOfCars(int totalNumberOfCars) {
		this.totalNumberOfCars = totalNumberOfCars;
	}

	public int getNumberOfCarsBooked() {
		return numberOfCarsBooked;
	}

	public void serNumberOfCarsBooked(int numberOfCarsBooked) {
		this.numberOfCarsBooked = numberOfCarsBooked;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float calculateExtraPrice(Driver driver) {
		float extraPrice;
		if (driver.getRating() >= 4.5f && driver.getRating() <= 5f) {
			extraPrice = 0.05f * this.price;
		} else {
			extraPrice = 0;
		}
		return extraPrice;
	}
}

class Driver {

	private String name;
	private float rating;

	Driver(String name, float rating) {
		this.name = name;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
}

public class associationExercise1 {

	public static void main(String args[]) {

		CabService cs = new CabService("Wala", 4, 3, 200);
		Driver d = new Driver("Vasanth", 4.6f);
		float finalPrice = cs.getPrice() + cs.calculateExtraPrice(d);
		System.out.println("Hi your cab has been booked, you need to pay " + finalPrice);

	}

}
