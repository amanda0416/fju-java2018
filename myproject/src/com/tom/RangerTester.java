package com.tom;

import java.util.Scanner;

public class RangerTester {

	public static void main(String[] args) {
		System.out.print("Please import a number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		boolean num = number>=-3 && number<=5 ;
		System.out.print(num);
		
	}

}
