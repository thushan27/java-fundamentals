package demo;

// Assignments - Inheritance and Polymorphism page 1

class NKShop {

	public void calculatePrice(int itemId) {

		if (itemId == 1001) {
			System.out.println("The price for this item is 1200");
		} else if (itemId == 1002) {
			System.out.println("The price for this item is 1000");
		} else if (itemId == 1003) {
			System.out.println("The price for this item is 999");
		} else if (itemId == 1004) {
			System.out.println("The price for this item is 1500");
		} else {
			System.out.println("Invalid Item ID");
		}

	}

	public void calculatePrice(String brandName, String itemType, int size) {
		if (brandName == "Puma" && itemType == "T-Shirt" && size == 32) {
			System.out.println("The price for this item is 1200");
		} else if (brandName == "Puma" && itemType == "T-Shirt" && size == 34) {
			System.out.println("The price for this item is 1200");
		} else if (brandName == "Puma" && itemType == "Skirt" && size == 32) {
			System.out.println("The price for this item is 1000");
		} else if (brandName == "Puma" && itemType == "Skirt" && size == 34) {
			System.out.println("The price for this item is 1000");
		} else if (brandName == "Reebok" && itemType == "T-Shirt" && size == 32) {
			System.out.println("The price for this item is 999");
		} else if (brandName == "Reebok" && itemType == "T-Shirt" && size == 34) {
			System.out.println("The price for this item is 999");
		} else if (brandName == "Reebok" && itemType == "Skirt" && size == 32) {
			System.out.println("The price for this item is 1500");
		} else if (brandName == "Reebok" && itemType == "Skirt" && size == 34) {
			System.out.println("The price for this item is 1500");
		} else {
			System.out.println("Invalid brand/item/size");
		}

	}

}

public class InheritanceAssignment1 {

	public static void main(String args[]) {
		NKShop shop = new NKShop();

		shop.calculatePrice(1001);
		shop.calculatePrice("Reebok", "Skirt", 34);

	}

}
