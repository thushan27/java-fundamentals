package demo;

//Assignments - Inheritance and Polymorphism page 4

class Employee1 {

	private int empId;
	private String name;
	private double salary;

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

class PermanentEmployee extends Employee1 {

	private double basicPay;
	private double hra;
	private int experience;

	public double getBasicPay() {
		return this.basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return this.hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public int getExperience() {
		return this.experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void calculateSalary() {

		double salary, variable = 0;

		if (this.experience < 3) {
			variable = 0;
		} else if (this.experience >= 3 && this.experience < 5) {
			variable = this.basicPay * 0.05;
		} else if (this.experience >= 5 & this.experience < 10) {
			variable = this.basicPay * 0.07;
		} else if (this.experience >= 10) {
			variable = this.basicPay * 0.12;
		}

		salary = variable + this.basicPay + this.hra;

		super.setSalary(salary);

	}

}

class ContractEmployee extends Employee1 {

	private double wages;
	private int hours;

	public double getWages() {
		return this.wages;
	}

	public void setWages(double wages) {
		this.wages = wages;
	}

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void calculateSalary() {

		double salary = this.hours * this.wages;
		super.setSalary(salary);

	}

}

public class InheritanceAssignment4 {

	public static void main(String args[]) {

		PermanentEmployee perm1 = new PermanentEmployee();
		perm1.setName("Anil");
		perm1.setEmpId(101);
		perm1.setBasicPay(10000);
		perm1.setHra(1500);
		perm1.setExperience(3);

		perm1.calculateSalary();

		System.out.println("Permanent Employee salary: " + perm1.getSalary());

		ContractEmployee con1 = new ContractEmployee();
		con1.setName("Ankit");
		con1.setEmpId(102);
		con1.setHours(500);
		con1.setWages(10);

		con1.calculateSalary();

		System.out.println("Contract Employee salary: " + con1.getSalary());

	}

}
