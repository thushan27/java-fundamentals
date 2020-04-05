package demo;

public class typeConversionExercise2 {
	
	public static void main(String args[]) {
		
		int billID = 1001;
		int customerID = 101;
		int discount = 2;
		double billAmount = 199.99;
		double discountedBill = billAmount - billAmount*((float)discount/100);
		System.out.println(billID);
		System.out.println(customerID);
		System.out.println(discountedBill);
		
		
	}

}
