package com.carlisle;

import java.util.Scanner;

public class Exam1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.print("Please enter number of tickets:");
			int tick = scanner.nextInt();
			scanner.nextLine();
			if (tick!=-1){
				System.out.print("How many round-trip tickets:");
				int round = scanner.nextInt();
				int total = (int)( round * 2000  * 0.9 ) + ( tick - round ) * 1000;
				System.out.println("Total tickets:"+ tick  + "\n" +"Round-trip:" + round + "\n" + "Total:" + total );
			}
			if (tick == -1){
				break;
			}
		}
		System.out.print("Thank you for your using!");
	}

}
