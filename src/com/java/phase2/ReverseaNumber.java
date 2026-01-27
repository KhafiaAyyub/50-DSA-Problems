package com.java.phase2;

import java.util.Scanner;

public class ReverseaNumber {
	
//Input: 1234
//Output: 4321
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int rev = 0;
				
		while(n>0) {
			int lastdigit = n%10; // gets last digit - 4
			rev = rev * 10 + lastdigit;
			n = n/10;        // removes last digit
		}
		
		System.out.println("Num is: " + rev);
		
	}
}
