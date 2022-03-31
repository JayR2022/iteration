package com.jr.iteration.application;

public class Coins {
	
	// Given a cost and an amount work out the change given in specific coinage
	
	public static void balanceMoney(float cost, float amount) {
		double balance = amount - cost;
		int tenPounds = 0;
		int fivePounds = 0;
		int twentyPence = 0;
		int twoPence = 0;
		
		do {
			balance = balance%10;
			tenPounds++;
			System.out.println("tenPounds+\"-£10 note\"");
			
		} while (balance > 10);
		
		do {
			balance = balance%5;
			fivePounds++;
			System.out.println(fivePounds+"-£5 note");
			
		} while (balance > 5);
		
		
		do {
			balance = balance%0.20;
			twentyPence++;
			System.out.println(twentyPence+"-20p's");
			
		} while (balance > 0.20);
		
		do {
			balance = balance%0.02;
			twoPence++;
			System.out.println(twoPence+"-2p's");
			
		} while (balance > 0.02);
//		balance = balance%5;
//		balance = balance%0.20;
//		balance = balance%0.02;
		
//		balance = balance%0.02;
//		balance = balance%0.20;
//		balance = balance%5;
//		balance = balance%10;
//		return tenPounds;
		
	}

}
