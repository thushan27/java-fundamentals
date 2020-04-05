package demo;

public class variablesAssignment8 {
	
	public static void main(String args[]) {
		
		int amountToBeMade = 21;
		int oneDollarsAvailable = 1;
		int fiveDollarsAvailable = 3;
		int oneDollarsNeeded, fiveDollarsNeeded, newAmountToBeMade;
		
		fiveDollarsNeeded = (int)(amountToBeMade/5);
		newAmountToBeMade = amountToBeMade - 5*fiveDollarsNeeded;
		oneDollarsNeeded = (int)(newAmountToBeMade);
		
		if(fiveDollarsNeeded <= fiveDollarsAvailable && 
		   oneDollarsNeeded <= oneDollarsAvailable) {
			System.out.println("One dollars needed: " + oneDollarsNeeded);
			System.out.println("Five dollars needed: " + fiveDollarsNeeded);
		}
		else {
			System.out.println(-1);
		}
		
		
	}

}
