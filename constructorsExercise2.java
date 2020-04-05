package demo;

class Chocolate {
	private int barCode;
	private String name;
	private int weight;
	private int cost;

	Chocolate() {
		barCode = 0;
		name = null;
		weight = 0;
		cost = 0;
	}

	public int getbarCode() {
		return barCode;
	}

	public void setbarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}

public class constructorsExercise2 {

	public static void main(String args[]) {

		Chocolate newChocolate = new Chocolate();

		newChocolate.setbarCode(0000);
		newChocolate.setCost(1);
		newChocolate.setName("Cadbury");
		newChocolate.setWeight(15);

		System.out.println(newChocolate.getbarCode());
		System.out.println(newChocolate.getCost());
		System.out.println(newChocolate.getName());
		System.out.println(newChocolate.getWeight());
	}

}
