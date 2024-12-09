package tutorial1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// User option selection		
		System.out.println("Select a conversion method you want:\n1. Celcius to fahrenheit\n2. Fahrenheit to celcius");
		
		
		// user choice input
		Scanner scanner1 = new Scanner(System.in);
		double userChoice = scanner1.nextDouble();
		
		
		// user choice eligibility check before conversion
		if (userChoice < 1 || userChoice > 2 ) {
			System.out.println("Incorrect choice. Enter 1 or 2 as value");
		}
		
		
		if (userChoice == 1) {
			System.out.println("Enter C value:");
			double Celc = scanner1.nextDouble();			
			double temperatureInFahrenheit = (Celc * 9/5) + 32;
			System.out.println("Temperature in fahrenheit is " + temperatureInFahrenheit+ "F");
		}
		
		
		if (userChoice == 2) {
			System.out.println("Enter F value");
			double Fahr = scanner1.nextDouble();			
			double temperatureInCelcius = (Fahr - 32) * 5/9;
			System.out.println("Temperature in celcius is " + temperatureInCelcius+ "C");
		}
		
		scanner1.close();
	}

}
 
	
