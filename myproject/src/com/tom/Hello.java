package com.tom;

import java.net.NetPermission;
import java.util.Random;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		int w = 1;
		while (w>0){
			System.out.println("hahaha");
			w = w -1 ; 
		}
		
		Random random = new Random();
		int secret = random.nextInt(100)+1;
		System.out.println(secret);
		
		int n = (int)(3/5.0);
		System.out.println(3/5.0);
		int g = 12/7;
		System.out.println(g);
		int m = 12%7;
		System.out.println(m);
		int a = 18;
		float b = 23.5689f;
		String nick = "Joy";
		System.out.printf("Hi, %s,your age: %d,bmi: %.2f\n",nick,a,b);
		               
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter temperature(C):");
		double c = scanner.nextDouble();
		double f = c*(9.0/5.0)+ 32;
		System.out.printf("%.1f C = %.1f F",c,f);
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("Your name:");
		String name = scanner.nextLine();
		System.out.println(name);*/
		
		Student stu = new Student("Simon", 70, 90);
		stu.print();
		
		System.out.println(3 == 5);
		System.out.println(3 <= 5);
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3 == s4);

	   /*stu.name = "Simon";
		 stu.english = 70;
		 stu.math = 90;*/

		Person p = new Person(53.5f, 1.65f);
		// p.weight = 53.5f ;
		// p.height = 1.65f ;
		System.out.println(p.bmi());
		p.hello();
		// Person simon = new Person() ;
		// Person jenny = null ;

	   /*System.out.println("Hello world!"); 
		 String name = "Amanda" ; 
		 int age= 18 ;
		 int schoolYear = 107 ; 
		 long birthday = 212 ; 
		 float height =1.6f ;
		 float weight = 50.5f ; 
		 float bmi = weight / (height * height);
		 System.out.println(name); System.out.println(age);
		 System.out.println(schoolYear); System.out.println(birthday);
		 System.out.println(height); System.out.println(weight);
		 System.out.println(bmi);*/
	}

}
