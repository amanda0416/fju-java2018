package com.tom;

public class Hello {
	public static void main(String[] args) {
		String name ="Hank";
		int english = 70;
		int math = 90;
		System.out.println(name +"\t"+ english +"\t"+ math +"\t"+(english+math)/2);
		
		Person p = new Person(53.5f, 1.65f);
		// p.weight = 53.5f ;
		// p.height = 1.65f ;
		System.out.println(p.bmi());
		p.hello();
		// Person hank = new Person() ;
		// Person jack = null ;

		/*
		 * System.out.println("Hello world!"); String name = "Amanda" ; int age
		 * = 18 ; int schoolYear = 107 ; long birthday = 212 ; float height =
		 * 1.6f ; float weight = 50.5f ; float bmi = weight / (height * height);
		 * System.out.println(name); System.out.println(age);
		 * System.out.println(schoolYear); System.out.println(birthday);
		 * System.out.println(height); System.out.println(weight);
		 * System.out.println(bmi);
		 */
	}

}
