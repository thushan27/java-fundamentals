package demo;

public class selectionControlStructuresExercise2 {
	
	public static void main(String args[]) {
		
		int num1 = 45;
		int num2 = 88;
		int num3 = 10;
		
		if(num1 > num2 & num1 > num3) {
			System.out.println(num1);
		}
		else if(num2 > num1 & num2 > num3) {
			System.out.println(num2);
		}
		else if(num3 > num1 & num3 > num2) {
			System.out.println(num3);
		}
	}

}
