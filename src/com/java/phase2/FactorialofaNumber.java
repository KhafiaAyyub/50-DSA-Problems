package com.java.phase2;

import java.util.Scanner;

public class FactorialofaNumber {

//	Input: 5
//	Output: 120
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int res = 1;
		
		for(int i=n;i>=1;i--) {
			res = res * i ;	
		}
		
		System.out.println("Factorial is: " + res);
	}
	
	
	
}
