package com.carlisle;

public class Ticket {
	int price = 1000;
	int totalT;
	int roundT;
	int totalP;
	public Ticket(int totalT,int roundT,int totalP) {
		this.totalT=totalT;
		this.roundT=roundT;
		this.totalP=totalP;
	}
	public Ticket(){
		int totalP = (int)( roundT * 2000  * 0.9 ) + ( totalT - roundT ) * price;
		
	}
}
