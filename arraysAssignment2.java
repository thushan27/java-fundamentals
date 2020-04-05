package demo;

public class arraysAssignment2 {
	
	public static void main(String args[]) {
		
		 double[] salary={23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		 
		 double totalSalary = 0;
		 double countBelow = 0;
		 double countAbove = 0;
		 
		 for(double eachSalary : salary) {
			 totalSalary+=eachSalary;
		 }
		 
		 double averageSalary = totalSalary/5;
		 
		 System.out.println("The average salary is "+ averageSalary + " runs");
		 
		 
		 for(double eachSalary : salary) {
			 if(eachSalary > averageSalary) {
				 countAbove+=1;
			 }
			 else if(eachSalary < averageSalary) {
				 countBelow+=1;
			 }
		 }
		 
		 System.out.println("Below average salary: " + countBelow);
		 System.out.println("Above average salary: " + countAbove);
	}

}
