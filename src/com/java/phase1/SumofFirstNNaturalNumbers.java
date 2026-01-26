package com.java.phase1;

import java.util.Scanner;

public class SumofFirstNNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 1 ;i<=n;i++) {
			count = count + i;
		}
		
		System.out.println("The sum is: " + count);
	}
}
