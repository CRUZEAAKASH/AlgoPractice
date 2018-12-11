//Formaula for the same is T(°C) = (T(°F) - 32) × 5/9

package oopspratice;

import java.util.Scanner;

public class ConvertFarehnittoCelcius {

	public static double fahrenheittocelcius(int fahrenheit) {
		double temp = fahrenheit-32;
		temp = temp / 1.8;
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit=");
		int fahrenheit = scanner.nextInt();
		System.out.println("Converted temperature="+fahrenheittocelcius(fahrenheit));
	}

}
