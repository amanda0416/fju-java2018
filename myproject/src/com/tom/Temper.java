package com.tom;

import java.security.PublicKey;

public class Temper {
	double celsius;
	
	public Temper (double celsius) {
		this.celsius = celsius;
	}
	
	public double fahrenheit () {
		return celsius * (9/5)+32;
		
	}
	
	public double kelven (){
		return celsius +273.15;
	}
}
