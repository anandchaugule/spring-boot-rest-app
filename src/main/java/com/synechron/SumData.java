package com.synechron;


public class SumData {
	
	
	public static void sum(int...args) {
		
		int n = 0;
		
		for ( int i = 0; i< args.length; i++) {
			
			n = n + args[i];
		}
		
		System.out.println("Sum : " + n);
	}
	
	public static void main(String... args) {
		
		sum(5,5,5,5);
		sum(5,5);
		sum(5,5,2);
	}

}
