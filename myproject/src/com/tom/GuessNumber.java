package com.tom;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int secret = random.nextInt(10)+1;
		System.out.println(secret);
		int count = 1 ;
		while (count > 0 && count <= 4) {
			System.out.print("Please write a number(1~10)(" + count + "/4)" + ":");
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
		if(count<=3){
			System.out.print("Excellent! The secret number is "+ secret );
		}
		if(count==4){
			System.out.print("Great! The secret number is "+ secret );
		 }
		if(count==5){
			System.out.print("Stupid! The answer is "+ secret );
		}		
   }

}


