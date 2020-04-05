package demo;

class Patient {
	private String patientName;
	private int age;
	private Bill bill;

	Patient(String patientName, int age, Bill bill) {
		this.patientName = patientName;
		this.age = age;
		this.bill = bill;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Bill getBill() {
		return this.bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public double calculateDiscount() {
		double discount;
		if (this.bill.getMedicines().length > 5) {
			discount = this.bill.getBillAmount() * 0.95;
		} else {
			discount = this.bill.getBillAmount();
		}
		return discount;
	}
}

class Bill {

	private int billId;
	private int billAmount;
	private String[] medicines;

	Bill(int billId, int billAmount, String[] medicines) {
		this.billId = billId;
		this.billAmount = billAmount;
		this.medicines = medicines;
	}

	public int getBillId() {
		return this.billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getBillAmount() {
		return this.billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public String[] getMedicines() {
		return this.medicines;
	}

	public void setMedicines(String[] medicines) {
		this.medicines = medicines;
	}

}

public class aggregationExercise1 {
	public static void main(String args[]) {
		String[] medicines = { "Alo", "vel", "kzry", "sento", "myx", "logy" };
		Bill bill1 = new Bill(101, 1000, medicines);
		Patient patient1 = new Patient("Vignesh", 23, bill1);
		double finalBillAmount = patient1.calculateDiscount();
		System.out.println("Hi " + patient1.getPatientName() + " you need to pay " + finalBillAmount);

	}
}
