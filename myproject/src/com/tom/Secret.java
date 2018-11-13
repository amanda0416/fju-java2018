package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Secret {
	public static void main(String[] args) {
		Random random = new Random();
		int secret = random.nextInt(100)+1;
		System.out.println(secret);
		System.out.print("Please write a number(1~100):");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		while (true) {
			if (number <= secret) {
				System.out.print(number+" to 100:");
				int number1 = scanner.nextInt();	
			}
			if(number >= secret) {
				System.out.print("1 to "+number+":");
				int number2 = scanner.nextInt();	
			}
			if(number == secret) {
			System.out.println("¦n´Î´Î!!");
			break;
			}
			
		} 
			
	}	
			
}
