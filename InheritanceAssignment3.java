package demo;

//Assignments - Inheritance and Polymorphism page 3

class Ticket {

	private int startPoint;
	private int endPoint;
	private int ticketAmount;

	Ticket() {

		this.startPoint = 0;
		this.endPoint = 0;
		this.ticketAmount = 0;

	}

	Ticket(int startPoint, int endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public int getStartPoint() {
		return this.startPoint;
	}

	public int getEndPoint() {
		return this.endPoint;
	}

	public int getTicketAmount() {
		return this.ticketAmount;
	}

	public boolean validateTravelPoints() {

		boolean condition1 = this.endPoint > 0 && this.startPoint > 0;
		boolean condition2 = this.endPoint > this.startPoint;
		return condition1 && condition2;

	}

	public int calcTicketAmt() {

		if (validateTravelPoints()) {

			this.ticketAmount = (this.endPoint - this.startPoint) * 10;

			return this.ticketAmount;

		} else {
			System.out.println("Invalid journey details");
			return 0;
		}

	}

}

public class InheritanceAssignment3 {

	public static void main(String args[]) {

		Ticket ticket = new Ticket(10,1);
		System.out.println("The ticket amount to be collected: " + ticket.calcTicketAmt());

	}

}
