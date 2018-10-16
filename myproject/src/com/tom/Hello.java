package com.tom;

public class Hello {
	public static void main(String[] args) {
		Student stu = new Student("Hank", 70, 90);
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

	   /*stu.name = "Hank"; 
		 stu.english = 70;
		 stu.math = 90;*/

		Person p = new Person(53.5f, 1.65f);
		// p.weight = 53.5f ;
		// p.height = 1.65f ;
		System.out.println(p.bmi());
		p.hello();
		// Person hank = new Person() ;
		// Person jack = null ;

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
