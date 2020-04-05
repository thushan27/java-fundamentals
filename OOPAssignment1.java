package demo;

class RRAccount {
	private String customerName;
	private Address address;
	private double depositAmount;
	
	RRAccount(String customerName, Address address, double depositAmount) {
		
		this.customerName = customerName;
		this.address = address;
		this.depositAmount = depositAmount;
		
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	public Address getAddress() {
		return this.address;
	}
	public double getDepositAmount() {
		return this.depositAmount;
	}
	public boolean isValidAddress() {
		int length = String.valueOf(address.getPinCode()).length();
		if(length == 6) {
			System.out.println("Congratulations!! Your account has been created");
		}
		else {
			System.out.println("The pin code you entered is invalid!");
		}
		return length == 6;
	}
}

class Address {

	private String firstLine;
	private String secondLine;
	private String city;
	private String state;
	private int pinCode;

	Address(String firstLine, String secondLine, String city, String state, int pinCode) {
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getFirstLine() {
		return this.firstLine;
	}

	public String getSecondLine() {
		return this.secondLine;
	}

	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	public int getPinCode() {
		return this.pinCode;
	}

}

public class OOPAssignment1 {

	public static void main(String args[]) {
		
		Address address1 = new Address("No.123","9th Cross, Trinethra Circle","Mysuru","Karnataka",70017);
		RRAccount RRAccount1 = new RRAccount("Rakesh",address1,50000.0);
		
		RRAccount1.isValidAddress();
		
		Address address2 = new Address("No.123","9th Cross, Trinethra Circle","Mysuru","Karnataka",570017);
		RRAccount RRAccount2 = new RRAccount("Rakesh",address2,50000.0);
		
		System.out.println("Customer Details" + "\n" + "**********");
		System.out.println("Customer Name " + "\t" + ": " + RRAccount2.getCustomerName());
		System.out.println("Address" + "\t" + ": " + address2.getFirstLine() + ", " + address2.getSecondLine() + ", " + address2.getCity() + ", " + address2.getState() + ", " + address2.getPinCode());
		System.out.println("Deposit Amount" + "\t" + ": " + RRAccount2.getDepositAmount());
		RRAccount2.isValidAddress();

	}
}
