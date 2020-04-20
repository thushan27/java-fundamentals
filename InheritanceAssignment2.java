package demo;

//Assignments - Inheritance and Polymorphism page 2

class Pizza1 {

	private String name;
	private int price;
	private String size;

	Pizza1(String name, int price, String size) {

		this.name = name;
		this.price = price;
		this.size = size;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}

public class InheritanceAssignment2 {

	public static void buyPizza(String name) {

		Pizza1 pizza1 = new Pizza1("Veg", 10, "medium");
		Pizza1 pizza2 = new Pizza1("Non-veg", 10, "small");
		Pizza1[] pizzaData = { pizza1, pizza2 };

		boolean flag = true;

		for (Pizza1 eachPizza : pizzaData) {
			if (eachPizza.getName() == name) {
				System.out.println("Hi, your pizza is successfully booked");
				flag = false;
				break;
			}

		}

		if (flag) {
			System.out.println("Hi, your pizza is not available");
		}

	}

	public static void buyPizza(int price, String size) {

		Pizza1 pizza1 = new Pizza1("Veg", 10, "medium");
		Pizza1 pizza2 = new Pizza1("Non-veg", 10, "small");
		Pizza1[] pizzaData = { pizza1, pizza2 };

		boolean flag = true;

		for (Pizza1 eachPizza : pizzaData) {
			if (eachPizza.getPrice() == price && eachPizza.getSize() == size) {
				System.out.println("Hi, your pizza is successfully booked");
				flag = false;
				break;
			}

			if (flag) {
				System.out.println("Hi, your pizza is not available");
			}

		}

	}

	public static void main(String args[]) {

		Pizza1 testPizza = new Pizza1("Pepperoni", 15, "extra large");
		Pizza1 testPizza2 = new Pizza1("Veg", 10, "medium");

		buyPizza(testPizza.getName());
		buyPizza(testPizza2.getPrice(), testPizza2.getSize());
	}

}
