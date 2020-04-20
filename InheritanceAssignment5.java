package demo;

// Assignments - Inheritance and Polymorphism page 5
// Issue with withdrawalBalance - should it be a method? Yes
// Issue with withdraw method for saving account. Conditions don't make sense to get 
// insufficient balance on first withdrawal. Only when withdrawing again does it happen.

class Customer {

	private String name;
	private int customerId;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

}

class Account1 {

	private int accountNo;
	private Customer customer;
	private double balance;

	public int getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

}

class SavingsAccount extends Account1 {

	private double minimumBalance;
	private int interestRate;

	SavingsAccount(int accountNo, double minimumBalance, int interestRate) {

		super.setAccountNo(accountNo);
		this.minimumBalance = minimumBalance;
		this.interestRate = interestRate;

	}

	public double getMinimumBalance() {
		return this.minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public int getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public void withdraw(double amount) {

		if (super.getBalance() > this.minimumBalance) {
			super.setBalance(super.getBalance() - amount);
		} else {
			System.out.println("You don't have sufficient balance!");
		}

	}

	public double calculateInterest() {
		return super.getBalance() * this.interestRate / 100;
	}

}

class CurrentAccount extends Account1 {

	private int overdraftAmount;

	CurrentAccount(Customer customer, int overdraftAmount, int accountNo, double balance) {

		super.setCustomer(customer);
		super.setAccountNo(accountNo);
		super.setBalance(balance + overdraftAmount);
		this.overdraftAmount = overdraftAmount;

	}

	public int getOverdraftAmount() {
		return this.overdraftAmount;
	}

	public void setOverdraftAmount(int overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

	public double withdrawalAmount() {
		return super.getBalance() + this.overdraftAmount;
	}

	public void withdraw(double amount) {

		double balance = super.getBalance();

		if (balance < 0) {
			if (amount > withdrawalAmount()) {
				System.out.println("You cannot withdraw this amount. Not enough balance.");
			} else {
				super.setBalance(balance - amount);
			}
		} else {
			super.setBalance(balance - amount);
		}

	}

}

public class InheritanceAssignment5 {

	public static void main(String args[]) {

		Customer customer1 = new Customer();
		customer1.setName("John");
		customer1.setCustomerId(1001);

		SavingsAccount accountSA = new SavingsAccount(101, 500, 12);
		accountSA.setCustomer(customer1);
		accountSA.setBalance(1000);

		System.out.println("For " + accountSA.getCustomer().getName());
		System.out.println("Account balance " + accountSA.getBalance());
		System.out.println("Interest " + accountSA.calculateInterest());
		System.out.println();

		accountSA.withdraw(1600);
		accountSA.withdraw(100);
		System.out.println();
		Customer customer2 = new Customer();
		customer2.setName("Jenny");
		customer2.setCustomerId(1002);

		CurrentAccount accountCA = new CurrentAccount(customer2, 500, 102, 2000);

		System.out.println("For " + accountCA.getCustomer().getName());
		accountCA.deposit(1500);
		System.out.println("Account balance " + accountCA.getBalance());

		accountCA.withdraw(4000);
		System.out.println("Account balance after withdrawal " + accountCA.getBalance());
		accountCA.withdraw(1500);

	}

}
