import java.util.Scanner;

public class ImprovedDistanceConverter2 {
	static final double INCHES_IN_A_FOOT = 12;
	static final double INCHES_IN_A_YARD = 36;
	static final double INCHES_IN_A_MILE = 63360;
	static final double INCHES_IN_A_LEAGUE = 218740;
	static double numberToConvertInInches = 0;
	
	public static void main(String[] args) {
		int menuChoice3 = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
				
			menuQuestion1();
			int menuChoice1 = input.nextInt();
			
			System.out.println("Enter the number you want to convert.");
			double numberToConvert = input.nextDouble();
			
			convertToInches(menuChoice1, numberToConvert);
			
			menuQuestion2();
			int menuChoice2 = input.nextInt();
			
			convertToFinal(menuChoice2, numberToConvertInInches);
			
			menuQuestion3();
			menuChoice3 = input.nextInt();
					
		} while (menuChoice3 == 1);
		
		input.close();
	}
	
	public static void menuQuestion1() {
		System.out.println("Choose unit of measure you are converting.");
		System.out.println("1) Inches");
		System.out.println("2) Feet");
		System.out.println("3) Yards");
		System.out.println("4) Miles");
		System.out.println("5) Leagues");
	}
	
	public static void menuQuestion2() {
		System.out.println("Choose unit of measure you want to convert to.");
		System.out.println("1) Inches");
		System.out.println("2) Feet");
		System.out.println("3) Yards");
		System.out.println("4) Miles");
		System.out.println("5) Leagues");
	}
	
	public static void convertToInches(int menuChoice1, double numberToConvert) {
		
		switch(menuChoice1) {
		case 1:
			numberToConvertInInches = numberToConvert;
			break;
		case 2:
			numberToConvertInInches = (numberToConvert * INCHES_IN_A_FOOT);
			break;
		case 3:
			numberToConvertInInches = (numberToConvert * INCHES_IN_A_YARD);
			break;
		case 4:
			numberToConvertInInches = (numberToConvert * INCHES_IN_A_MILE);
			break;
		case 5:
			numberToConvertInInches = (numberToConvert * INCHES_IN_A_LEAGUE);
			break;
		
		}
	}
	
	public static void convertToFinal(int menuChoice2, double numberToConvertInInches) {
		
		switch (menuChoice2) {
		case 1: 
			System.out.println(numberToConvertInInches);
			break;
		case 2:
			System.out.println(numberToConvertInInches / INCHES_IN_A_FOOT);
			break;	
		case 3:
			System.out.println(numberToConvertInInches / INCHES_IN_A_YARD);
			break;
		case 4:
			System.out.println(numberToConvertInInches / INCHES_IN_A_MILE);
			break;
		case 5:
			System.out.println(numberToConvertInInches / INCHES_IN_A_LEAGUE);
			break;
		}
	}
	
	public static void menuQuestion3() {
		System.out.println("Would you like to convert another number? Please select \"Yes\" or \"Exit\". ");
		System.out.println("1) Yes");
		System.out.println("2) Exit");
	}
}

