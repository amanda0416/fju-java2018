package com.tom;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("Are you 18?(Y/N)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		boolean adult = line.equalsIgnoreCase("Y");
		Member member = new Member(adult);
		if (member.adult){
			member.input();
		}else {
			System.out.println("Bye!");
		}
	}

}
