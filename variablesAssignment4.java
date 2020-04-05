package demo;

public class variablesAssignment4 {
	
	public static void main(String args[]) {
		int flightsTookOff = 50;
		int flightsLanded = 85;
		int seatingCapTookOff = 180;
		int seatingCapLanded = 150;
		int cookies;
		
		cookies = (flightsTookOff*seatingCapTookOff*2) + 
				  (flightsLanded*seatingCapLanded);
		
		System.out.println("Number of cookies sold = " + cookies);
	}

}
