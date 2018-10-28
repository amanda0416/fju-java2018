package com.tom;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Member {
	boolean adult;
	int age;
	String name;
	String nickName;
	
	public Member(boolean adult) {
		this.adult = adult;
	}
	
	public Member(int age,String name,String nickName) {
		this.age = age;
		this.name =name;
		this.nickName = nickName;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your age?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Your name?");
		String name = scanner.nextLine();
	    System.out.print("Your nickname?");
	    String nickname = scanner.nextLine();
	    System.out.println(age+"/"+name+"/"+nickname);
	}
	
}