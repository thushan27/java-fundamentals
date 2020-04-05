package demo;

class CourseRegistration {

	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hostelRequired;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public float getQualifyingMarks() {
		return qualifyingMarks;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public int getCourseId() {
		return courseId;
	}

	public boolean isHostelRequired() {
		return hostelRequired;
	}

	public boolean validateMarks(float qualifyingMarks) {
		boolean eligible = qualifyingMarks >= 65 && qualifyingMarks <= 100;
		if (eligible == true) {
			System.out.println("You are eligible for admission");
		} else {
			System.out.println("You are not eligible for admission");
		}
		return eligible;
	}

	public boolean validateCourseId() {
		int[] courseArray = { 1001, 1002, 1003, 1004, 1005 };
		int count = 0;

		for (int eachCourse : courseArray) {
			if (eachCourse == courseId) {
				count += 1;
			}
		}
		if (count == 0) {
			System.out.println("Invalid course Id");
		}
		return count == 1;
	}

	public void calculateCourseFee() {
		if (courseId == 1001) {
			if (qualifyingMarks >= 85) {
				this.courseFee = 55000 * 0.85;
			} else if (qualifyingMarks >= 70 && qualifyingMarks < 85) {
				this.courseFee = 55000 * 0.9;
			} else if (qualifyingMarks >= 65 && qualifyingMarks < 70) {
				this.courseFee = 55000 * 0.95;
			}
		}
		if (courseId == 1002) {
			if (qualifyingMarks >= 85) {
				this.courseFee = 35675 * 0.85;
			} else if (qualifyingMarks >= 70 && qualifyingMarks < 85) {
				this.courseFee = 35675 * 0.9;
			} else if (qualifyingMarks >= 65 && qualifyingMarks < 70) {
				this.courseFee = 35675 * 0.95;
			}
		}
		if (courseId == 1003) {
			if (qualifyingMarks >= 85) {
				this.courseFee = 28300 * 0.85;
			} else if (qualifyingMarks >= 70 && qualifyingMarks < 85) {
				this.courseFee = 28300 * 0.9;
			} else if (qualifyingMarks >= 65 && qualifyingMarks < 70) {
				this.courseFee = 28300 * 0.95;
			}
		}
		if (courseId == 1004) {
			if (qualifyingMarks >= 85) {
				this.courseFee = 22350 * 0.85;
			} else if (qualifyingMarks >= 70 && qualifyingMarks < 85) {
				this.courseFee = 22350 * 0.9;
			} else if (qualifyingMarks >= 65 && qualifyingMarks < 70) {
				this.courseFee = 22350 * 0.95;
			}
		}
		if (courseId == 1005) {
			if (qualifyingMarks >= 85) {
				this.courseFee = 115000 * 0.85;
			} else if (qualifyingMarks >= 70 && qualifyingMarks < 85) {
				this.courseFee = 115000 * 0.9;
			} else if (qualifyingMarks >= 65 && qualifyingMarks < 70) {
				this.courseFee = 115000 * 0.95;
			}
		}
	}
}

public class classesAssignment1 {

	public static void main(String args[]) {

		CourseRegistration newCoReg = new CourseRegistration();

		newCoReg.setStudentName("Peter");
		newCoReg.setCourseId(1005);
		newCoReg.setQualifyingMarks(78);
		newCoReg.setRegistrationId(5001);
		newCoReg.setHostelRequired(false);
		newCoReg.calculateCourseFee();

		System.out.println("*****Course Allocation Details*****");
		System.out.println();
		System.out.println("Student Name" + "\t" + ":" + newCoReg.getStudentName());
		System.out.println("Course Id" + "\t" + ":" + newCoReg.getCourseId());
		System.out.println("Qualifying Exam Marks" + "\t" + ":" + newCoReg.getQualifyingMarks());
		System.out.println("Student Registration ID" + "\t" + ":" + newCoReg.getRegistrationId());
		System.out.println("Total course fee" + "\t" + ":" + newCoReg.getCourseFee());
		System.out.println("Hostel required" + "\t" + ":" + newCoReg.isHostelRequired());

	}

}
