package com.tom;

public class Student {
	String name;
	int english;
	int math;
	
	public Student(String name,int english,int math) {
		this.name = name;
		this.english = english;
		this.math = math;
	}
	
	public void print(){
		int average = getAverage();
		System.out.print(name +"\t"+ english +"\t"+ math +"\t"+ average +"\t"+ highest() +"\t"+((average<60) ?"FAILED":"PASS"));
		if( average < 60){
			System.out.println("FAILED");
		}else{
			System.out.println("PASS");
		}
	}
	
	public char getGrading(){
		int average = getAverage();
		char grading ='F';
		switch(average/10){
		case 10:
		case 9:
			grading ='A';
			break;
		case 8:
			grading ='B';
			break;
		case 7:
			grading ='C';
			break;
		case 6:
			grading ='D';
			break;
		}
		
		/*if (average>=90 && average>=100){
			grading = 'A';
		}else if(average>=80 && average>=89){
			grading = 'B';
		}else if(average>=70 && average>=79){
			grading = 'C';
		}else if(average>=60 && average>=69){
			grading = 'D';
		}
		*/
		return grading;
	}
	
	public int highest(){
		if(english > math){
			return english;
		}else{
			return math;
		}
	}
	
	public int getAverage(){
		return (english+math)/2;
	}
	
}
