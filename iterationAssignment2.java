package demo;

public class iterationAssignment2 {
	
	public static void main(String args[]) {
		
		int number = 100;
		int sum = 0;
		String stringNumber = Integer.toString(number);
		
		for(int i = 0; i< stringNumber.length(); i++) {
			
			sum += Integer.valueOf(stringNumber.charAt(i));
	
	}
		System.out.println(sum);
}
	
}