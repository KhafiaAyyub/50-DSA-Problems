package com.java.phase2;

import java.util.Scanner;

public class PalindromeNumber {

	//123 - 321
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		int num = n;
		
		while(n>0) {
			 int lastDigit = n%10;
			 rev = rev * 10 + lastDigit;
			 n = n/10;
		}
		
		if(rev == num) {
		System.out.println("palindrome number");
	} else {
		System.out.println("not palindrome");
	}
	
}
}