package com.carlisle;

import java.util.Random;
import java.util.Scanner;

public class Exam3 {
	
	public static void main(String[] args) {
		Random random = new Random();
		int secret = random.nextInt(10)+1;
		System.out.println(secret);
		int count = 0 ;
		while (true) {
			System.out.print("Please write a number(1~10):");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			count++;
			if (number < secret) {
				System.out.println("higher");
			}
			if(number > secret) {
				System.out.println("lower");
			}
			if(number == secret){
				break;
		    } 
	  }
		if(count<=2){
			System.out.print("Excellent! The secret number is "+ secret );
		}else{
			System.out.print("Great! The secret number is "+ secret );
		}
			
   }
}


