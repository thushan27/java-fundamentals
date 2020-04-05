package demo;

class Loan {

	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	private static int loanCounter;

	Loan() {
		loanNo = 0;
		accountNo = 0;
		customerNo = 0;
		loanAmount = 0f;
		loanDuration = 0;
		interest = 0f;
		loanCounter++;
	}

	public int getLoanNo() {
		return this.loanNo;
	}

	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}

	public int getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getCustomerNo() {
		return this.customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public float getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanDuration() {
		return this.loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public float getInterest() {
		return this.interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

	Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {

		this.accountNo = accountNo;
		this.customerNo = customerNo;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.interest = interest;
		loanCounter++;
	}

	static {
		loanCounter = 100;
	}

	public int getNumOfObjects() {
		return loanCounter;
	}

}

public class OOPAssignment4 {

	public static void main(String args[]) {

		Loan loan1 = new Loan();
		System.out.println(loan1.getNumOfObjects());
		Loan loan2 = new Loan();
		System.out.println(loan2.getNumOfObjects());
		Loan loan3 = new Loan();
		System.out.println(loan3.getNumOfObjects());

		// To print the count of instances created in the main method

	}

}
