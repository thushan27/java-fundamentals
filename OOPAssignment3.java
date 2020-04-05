package demo;

class InfyDanceRegistration {
	
	private String name;
	private long contactNumber;
	private String city;
	private static int counter;
	
	InfyDanceRegistration(String name, long contactNumber, String city) {
		
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
		
	}	
	public String getName() {
		return this.name;
	}
	static {
		counter = 10001;
	}
	
	public String generateRegistrationId() {
		String regID;
		regID = "D" + counter;
		counter = counter+1;
		return regID;
	}
}


public class OOPAssignment3 {
	
	public static void main(String args[]) {
		InfyDanceRegistration person1 = new InfyDanceRegistration("Frank",9870745632l,"Kolkata");
		InfyDanceRegistration person2 = new InfyDanceRegistration("Maya",8878964509l,"Mysore");
		System.out.println("Hi " + person1.getName() + " your registration ID is " + person1.generateRegistrationId());
		System.out.println("Hi " + person2.getName() + " your registration ID is " + person2.generateRegistrationId());

	}

}
