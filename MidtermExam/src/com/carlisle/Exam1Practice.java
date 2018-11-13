package com.carlisle;

import java.util.Scanner;

public class Exam1Practice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ticket ticket = new Ticket();
		int totalT = 1;
		while (totalT != 0){
			System.out.print("Please enter number of tickets:");
			ticket.totalT = scanner.nextInt();
			scanner.nextLine();
			if (totalT!=-1){
				System.out.print("How many round-trip tickets:");
				ticket.roundT = scanner.nextInt();
				System.out.println("Total tickets:"+ ticket.totalT  + "\n" +"Round-trip:" + ticket.roundT + "\n" + "Total:" + ticket.totalP );
			}
			if (totalT == -1){
				break;
			}
		}
		System.out.print("Thank you for your using!");
	}

}
