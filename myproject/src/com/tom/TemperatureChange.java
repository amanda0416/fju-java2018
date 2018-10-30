package com.tom;

import java.util.Scanner;

public class TemperatureChange {
	
	public static void main(String[] args) {
		System.out.print("Please enter temperature(C):");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		Temper temperature = new Temper(c);
		System.out.printf("%.1f C = %.1f F = %.2f K",c,temperature.fahrenheit(),temperature.kelven());
	
	
	}

}
