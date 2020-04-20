package demo;

//Assignments - Inheritance and Polymorphism page 6

class EventRegistration {

	private String name;
	private String nameOfEvent;
	private double registrationFee;

	public EventRegistration(String name, String nameOfEvent) {

		this.name = name;
		this.nameOfEvent = nameOfEvent;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameOfEvent() {
		return this.nameOfEvent;
	}

	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}

	public double getRegistrationFee() {
		return this.registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}

	public void registerEvent() {

		if (getNameOfEvent() == "ShakeALeg") {
			System.out.println("Base Fee: " + 100);
		} else if (getNameOfEvent() == "Sing&Win") {
			System.out.println("Base Fee: " + 150);
		} else if (getNameOfEvent() == "Actathon") {
			System.out.println("Base Fee: " + 70);
		} else if (getNameOfEvent() == "PlayAway") {
			System.out.println("Base Fee: " + 130);
		} else {
			System.out.println("Please choose a valid event");
		}

	}

}

class SingleEventRegistration extends EventRegistration {

	private int participantNo;

	SingleEventRegistration(String name, String nameOfEvent, int participantNo) {

		super(name, nameOfEvent);
		this.participantNo = participantNo;

	}

	public int getParticipantNo() {
		return this.participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}

	public void registerEvent() {

		if (getNameOfEvent() == "ShakeALeg") {
			System.out.println("Thank you " + super.getName() + ". Your registration fee is: " + 100
					+ ". You are participant no: " + this.participantNo);
		} else if (getNameOfEvent() == "Sing&Win") {
			System.out.println("Thank you " + super.getName() + ". Your registration fee is: " + 150
					+ ". You are participant no: " + this.participantNo);
		} else if (getNameOfEvent() == "PlayAway") {
			System.out.println("Thank you " + super.getName() + ". Your registration fee is: " + 130
					+ ". You are participant no: " + this.participantNo);
		} else {
			System.out.println("Please choose a valid event");
		}

	}

}

class TeamEventRegistration extends EventRegistration {

	private int noOfParticipants;
	private int teamNo;

	TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {

		super(name, nameOfEvent);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;

	}

	public int getNoOfParticipants() {
		return this.noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return this.teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}

	public void registerEvent() {

		if (getNameOfEvent() == "ShakeALeg") {
			System.out.println("Thank you " + super.getName() + ". Your registration fee is: "
					+ 50 * getNoOfParticipants() + ". You are participant no: " + this.teamNo);
		} else if (super.getNameOfEvent() == "Sing&Win") {
			System.out.println("Thank you " + super.getName() + ". Your registration fee is: "
					+ 60 * getNoOfParticipants() + ". You are participant no: " + this.teamNo);
		} else if (super.getNameOfEvent() == "Actathon") {
			System.out.println("Thank you " + super.getName() + ". Your registration fee is: "
					+ 80 * getNoOfParticipants() + ". You are participant no: " + this.teamNo);
		} else if (super.getNameOfEvent() == "PlayAway") {
			System.out.println("Thank you " + super.getName() + ". Your registration fee is: "
					+ 100 * getNoOfParticipants() + ". You are participant no: " + this.teamNo);
		} else {
			System.out.println("Please choose a valid event");
		}

	}

}

public class InheritanceAssignment6 {

	public static void main(String args[]) {

		SingleEventRegistration participant1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
		participant1.registerEvent();
		
		TeamEventRegistration team1 = new TeamEventRegistration("Aura", "ShakeALeg", 5, 1);
		team1.registerEvent();

		SingleEventRegistration participant2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
		participant2.registerEvent();
		
		
		
	}

}
