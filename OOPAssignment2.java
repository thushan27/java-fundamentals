package demo;

class Trainee {
	private int traineeId;
	private String classRoom;

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
}

class Classroom {

	private int numOfSeats;
	private String name;

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Admin {

	private int adminId;
	private Classroom classRoom;

	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public Classroom getClassRoom() {
		return this.classRoom;
	}

	public void setClassRoom(Classroom classRoom) {
		this.classRoom = classRoom;
	}

	public int allocate(Trainee trainee) {
		trainee.getClassRoom();
		int numOfSeats = classRoom.getNumOfSeats();
		classRoom.setNumOfSeats(numOfSeats - 1);
		return classRoom.getNumOfSeats();
	}

}

public class OOPAssignment2 {

	public static void main(String args[]) {

		Classroom classroom1 = new Classroom();
		classroom1.setNumOfSeats(100);
		classroom1.setName("GO45");

		Trainee trainee1 = new Trainee();
		trainee1.setTraineeId(1005);

		Admin admin1 = new Admin();
		admin1.setAdminId(4243);
		admin1.setClassRoom(classroom1);

		System.out.println("Number of seats after allocating trainee " + trainee1.getTraineeId() + " is : "
				+ admin1.allocate(trainee1));

	}

}
